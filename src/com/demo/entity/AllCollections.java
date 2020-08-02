package com.demo.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class AllCollections {

    private List listProp;

    private Map mapProp;

    private String[] arrayProp;

    private Set setProp;

    public AllCollections() {
    }

    public List getListProp() {
        return listProp;
    }

    public void setListProp(List listProp) {
        this.listProp = listProp;
    }

    public Map getMapProp() {
        return mapProp;
    }

    public void setMapProp(Map mapProp) {
        this.mapProp = mapProp;
    }

    public Set getSetProp() {
        return setProp;
    }

    public void setSetProp(Set setProp) {
        this.setProp = setProp;
    }

    public String[] getArrayProp() {
        return arrayProp;
    }

    public void setArrayProp(String[] arrayProp) {
        this.arrayProp = arrayProp;
    }

    @Override
    public String toString() {
        String temp = "";
        for (String s : arrayProp) {
            temp += s;
        }
        return this.listProp + "\n" + this.mapProp + "\n" + this.setProp + "\n" + temp;
    }
}
