package app.enums;

public enum Gender {
    FEMININO("Feminino"), MASCULINO("Masculino");

    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}

