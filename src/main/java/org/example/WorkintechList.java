package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class WorkintechList extends ArrayList/*WorkintechList<T>*/ {


    @Override
    public boolean add(Object object) {
        if (!this.contains(object)) {
            return super.add(object);
        }
        return false;
    }

  public void sort(){
        Collections.sort(this);
  }


    @Override
    public boolean remove(Object o) {
        sort();
        return super.remove(o);
    }
}






    /*  private ArrayList<T> list;

    public WorkintechList() {
        list = new ArrayList<>();
    }

    // Listeye eleman ekleme
    public boolean add(T element) {
        if (!list.contains(element)) { // Eğer öğe zaten varsa, ekleme yapılmaz.
            list.add(element);
            return true;
        }
        return false;
    }

    // Listeyi sıralama metodu
    public void sort() {
        Collections.sort(list, (a, b) -> {
            if (a instanceof String && b instanceof String) {
                return ((String) a).compareTo((String) b); // String'ler için A-Z sıralama
            } else if (a instanceof Number && b instanceof Number) {
                return Double.compare(((Number) a).doubleValue(), ((Number) b).doubleValue()); // Sayılar için sıralama
            }
            return 0;
        });
    }

    // Listeyi yazdırma metodu
    public void print() {
        for (T element : list) {
            System.out.println(element);
        }
    }

    // Listeye eleman silme
    public boolean remove(Object element) {
        if (list.contains(element)) {
            list.remove(element);
            sort(); // Silme işleminden sonra sıralama yapılır.
            return true;
        }
        return false;
    }

    // Listede eleman sayısını döndürme
    public int size() {
        return list.size();
    }

    // Belirli bir elemanın olup olmadığını kontrol etme
    public boolean contains(T element) {
        return list.contains(element);
    }

    // Listeyi alma
    public ArrayList<T> getList() {
        return list;
    }

    // get(int) metodu ekleyin
    public T get(int index) {
        return list.get(index);
    }*/

