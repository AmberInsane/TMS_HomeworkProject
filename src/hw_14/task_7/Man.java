package hw_14.task_7;

//Сделать класс Man у которого 3 поля - имя, фамилия, тел.номер.
//Сделать конструкторы:
//1. с параметрами имя тел. номер,
//2. с параметрами имя, фамилия тел. номер.
//3. с параметрами имя, фамилия.
//Конструктора без параметров быть не должно. Избежать дублирования кода
public class Man {
    private String name;
    private String surName;
    private String telephoneNum;

    public Man(String name, String param, String... args) {
        this.name = name;
        if (args.length > 0) {
            this.surName = param;
            this.telephoneNum = args[0];
        } else {
            if (param.matches("(.)*(\\d)(.)*")) {
                this.telephoneNum = param;
            } else {
                this.surName = param;
            }

        }
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", telephoneNum='" + telephoneNum + '\'' +
                '}';
    }
}
