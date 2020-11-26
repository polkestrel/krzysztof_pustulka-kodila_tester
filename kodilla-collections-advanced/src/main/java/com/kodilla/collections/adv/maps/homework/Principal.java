package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String principalfirstname;
    private String principallastname;
    private String schoolname;

    public Principal(String principalfirstname, String principallastname, String schoolname) {
        this.principalfirstname = principalfirstname;
        this.principallastname = principallastname;
        this.schoolname = schoolname;
    }

    public String getPrincipalFirstName() {
        return principalfirstname;
    }

    public String getPrincipalLastName() {
        return principallastname;
    }

    public String getSchoolName() {
        return schoolname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(principalfirstname, principal.principalfirstname) &&
                Objects.equals(principallastname, principal.principallastname) &&
                Objects.equals(schoolname, principal.schoolname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(principalfirstname, principallastname, schoolname);
    }

    @Override
    public String toString() {
        return "Principal{" +
                "principalfirstname='" + principalfirstname + '\'' +
                ", principallastname='" + principallastname + '\'' +
                ", schoolname='" + schoolname + '\'' +
                '}';
    }
}
