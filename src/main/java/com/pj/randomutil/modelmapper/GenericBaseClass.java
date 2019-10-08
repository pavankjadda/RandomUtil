package com.pj.randomutil.modelmapper;

public class GenericBaseClass<T>
{
    private T obj;

    GenericBaseClass(T obj)
    {
        this.obj=obj;
    }
    public T getObject()
    {
        return this.obj;
    }
}
