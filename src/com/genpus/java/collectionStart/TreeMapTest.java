package com.genpus.java.collectionStart;

import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap();
        tm.put(new TreeComp(-3), "C++");
        tm.put(new TreeComp(4), "Java");
        tm.put(new TreeComp(9), "Groovy");
        tm.put(new TreeComp(7), "JavaScript");

        System.out.println(tm);

        System.out.println(tm.firstEntry());

        System.out.println(tm.lastKey());

        System.out.println(tm.higherKey(new TreeComp(6)));

        System.out.println(tm.higherEntry(new TreeComp(7)));

        System.out.println(tm.subMap(new TreeComp(4), new TreeComp(8)));
    }
}

// 建一个实现了 Comparable的类
class TreeComp implements Comparable
{
    int count;

    public TreeComp(int count)
    {
        this.count = count;
    }

    // 输出方法改造：
    public String toString()
    {
        return "R[count:"+ count + "]";
    }

    @Override
    public int compareTo(Object o) {
        TreeComp tc = (TreeComp)o;
        return count > tc.count ? 1 : count<tc.count ? -1 :0 ;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj !=null && obj.getClass() == TreeComp.class)
        {
            TreeComp tc = (TreeComp)obj;
            return tc.count == this.count;
        }
        return false;
    }
}