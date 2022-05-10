package kg.geektech.mouth2.homework1;

public class User {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalNameLengthException {
        if (name.length() > 20){
            throw new IllegalNameLengthException("Длина имени не"+
                    "должно быть больше 20 символов. Вы задали ="+ name);
        }
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age <= 0 || age >= 100){
            throw new IllegalAgeException(""
                    +"Возраст не может быть больше 100 или меньше 0"+
                    " Ваш заданный возраст "+ age);
        }
        this.age = age;
    }
}
