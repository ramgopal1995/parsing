package com.xmlparsing.parsing.executor;

class Emplyee1
{
    private String name;
    private int salary;

    public Emplyee1(String name, int salary)
    {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" + name + ", " + salary + "}";
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Emplyee1 emplyee1 = (Emplyee1) o;

        if (salary != emplyee1.salary) {
            return false;
        }

        if (name != null ? !name.equals(emplyee1.name) : emplyee1.name != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = name != null ? name.hashCode() : 0;
        result =31*result + salary;
        return result;
    }
}
