package com.sfl.overheid.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * User: Arthur Asatryan
 * Company: SFL LLC
 * Date: 10/19/16
 * Time: 3:24 PM
 */
public class Embedded implements Serializable {
    private static final long serialVersionUID = 5587461835871092978L;

    //region Properties
    @JsonProperty("rechtspersoon")
    private List<CorporationModel> corporations;
    //endregion

    //region Constructors
    public Embedded() {
    }

    public Embedded(final List<CorporationModel> corporations) {
        this.corporations = corporations;
    }
    //endregion

    //region Equals, HashCode and ToString
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Embedded)) {
            return false;
        }
        final Embedded embedded = (Embedded) o;
        return new EqualsBuilder()
                .append(corporations, embedded.corporations)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(corporations)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("corporations", corporations)
                .toString();
    }
    //endregion

    //region Properties getters and setters
    public List<CorporationModel> getCorporations() {
        return corporations;
    }

    public void setCorporations(final List<CorporationModel> corporations) {
        this.corporations = corporations;
    }
    //endregion
}
