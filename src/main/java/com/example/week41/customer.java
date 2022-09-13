package com.example.week41;

public class customer {
    private String ID;
    private String name;
    private boolean sex;
    private int age;
    private boolean sex_con;
    public customer(){
        ID = "";
        name = null;
        sex = false;
        age = 0;
    }
    public customer(String ID, String n, boolean s, int a){
        if(a < 0){
            a = 0;
        }
        this.ID = ID;
        this.name = n;
        this.sex = s;
        this.age = a;
    }
    public customer(String ID, String n, String s, int a){
        if(s.equals("Female") || s.equals("female")){
            this.sex_con = false;
        }
        else{
            this.sex_con = true;
        }
        if(a < 0){
            a = 0;
        }
        this.ID = ID;
        this.name = n;
        this.sex = this.sex_con;
        this.age = a;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
