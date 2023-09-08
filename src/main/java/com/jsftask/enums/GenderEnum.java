package com.jsftask.enums;

public enum GenderEnum {

    MALE(0), FEMALE(1);

    private final Integer genderId;

    GenderEnum(Integer genderId) {
        this.genderId = genderId;
    }

    public Integer getGenderId() {
        return genderId;
    }

    public static GenderEnum findByGenderId(Integer genderId) {
        for (GenderEnum gender : values()) {
            if (gender.genderId == genderId) return gender;
        }
        return null;
    }
}
