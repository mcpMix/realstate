package br.com.realstate.domain;

import br.com.realstate.commos.utils.TimeZones;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@MappedSuperclass
public class DomainModel<T extends DomainModel<T>> implements Serializable {
    private static final long serialVersionUID = 6325905633364486954L;
    public static final String ID = "id";
    public static final String DATE_MODEL = "dateModel";
    @Id
    @GeneratedValue
    private Long id;
    @Embedded
    private DateModel dateModel;
    @Version
    private Integer version;

    public DomainModel() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DateModel getDateModel() {
        return this.dateModel;
    }

    public void setDateModel(DateModel dateModel) {
        this.dateModel = dateModel;
    }

    public Integer getVersion() {
        return this.version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @PrePersist
    public void initializeDates() {
        LocalDateTime now = LocalDateTime.now( TimeZones.getDefault());
        this.dateModel = new DateModel(now, now);
    }

    @PreUpdate
    public void updateUpdatedAt() {
        this.dateModel.setUpdatedAt(LocalDateTime.now(TimeZones.getDefault()));
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE ).toString();
    }

    public int hashCode() {
        int prime = 1;
        int result = 1;
        result = 31 * result + (this.dateModel == null ? 0 : this.dateModel.hashCode());
        result = 31 * result + (this.id == null ? 0 : this.id.hashCode());
        result = 31 * result + (this.version == null ? 0 : this.version.hashCode());
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            DomainModel<?> other = (DomainModel)obj;
            if (this.dateModel == null) {
                if (other.dateModel != null) {
                    return false;
                }
            } else if (!this.dateModel.equals(other.dateModel)) {
                return false;
            }

            if (this.id == null) {
                if (other.id != null) {
                    return false;
                }
            } else if (!this.id.equals(other.id)) {
                return false;
            }

            if (this.version == null) {
                if (other.version != null) {
                    return false;
                }
            } else if (!this.version.equals(other.version)) {
                return false;
            }

            return true;
        }
    }
}

