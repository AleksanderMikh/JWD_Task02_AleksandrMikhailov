package by.tc.task02.entity;

import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class Essence {

    private List<Essence> listOfEssences = new ArrayList<Essence>();
    private Essence parent,
            pointer;

    private String essenceName,
            data,
            attributs;
//////////////////////////////////////////////////////////////////

    public void setEssenceName(String name) {
        this.essenceName = name;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setAttributs(String attributs) {
        this.attributs = attributs;
    }

    public void setParent(Essence parent) {
        this.parent = parent;
    }

    public void addEssence(Essence essence) {
        this.listOfEssences.add(essence);
    }

    public Essence getParent() {
        return parent;
    }

    public String getEssenceName() {
        return essenceName;
    }

    public String getData() {
        return data;
    }

    public String getAttributs() {
        return attributs;
    }

    public void setPointer(Essence pointer) {
        this.pointer = pointer;
    }

    public Essence getThis() {
        return this;
    }

    public Essence getPointer() {
        return pointer;
    }

    public List<Essence> getListOfEssences() {
        return listOfEssences;
    }

    public String toString (){
        return null;
    }

}
