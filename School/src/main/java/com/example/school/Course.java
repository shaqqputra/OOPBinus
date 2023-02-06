package com.example.school;

public class Course
{
    protected String code;
    protected String name;
    protected int scu;

    public Course()
    {

    }

    public Course(String code, String name, int scu)
    {
        this.code = code;
        this.name = name;
        this.scu = scu;
    }
    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getScu()
    {
        return scu;
    }

    public void setScu(int scu)
    {
        this.scu = scu;
    }
}
