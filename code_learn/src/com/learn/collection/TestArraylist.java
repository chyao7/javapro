package com.learn.collection;

class SxtArrayList {

    private Object[] elementData;

    private int size=0;

    public SxtArrayList(){
        this(10);
    }

//    public int size(){
//        return size;
//    }

    public SxtArrayList(int initialCapacity){
        if(initialCapacity < 0){
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        elementData = new Object[initialCapacity];
    }

    public void add(Object obj){
        //数组扩容
        if(size>=elementData.length){
            Object[] newarray = new Object[size*2+1];
            System.arraycopy(elementData,0,newarray,0,elementData.length);
            elementData = newarray;
        }

        elementData[size++] = obj;

    }

    public void remove(int index){

        if(size>=elementData.length){
            Object[] newarray = new Object[size*2+1];
            System.arraycopy(elementData,0,newarray,0,elementData.length);
            elementData = newarray;
        }
        int nummoved = size-index-1;
        System.arraycopy(elementData,index+1,elementData,index,nummoved);
        elementData[--size] = null;
    }

    public Object get(int index){
        if (index<0||index>=size){
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return elementData[index];
    }

    public static void main(String[] args) {
        SxtArrayList list = new SxtArrayList();
        list.add("333");
        list.add("4444");
        list.add("4444");
        list.add("4444");
        list.add("4444");
        list.add("4444");
        list.add("4444");
        list.add("4444");
        list.add("4444");
        list.add("4444");
        list.add("4444");
        list.add("4444");
        list.add("4444");
        list.add("4444");
        list.add("4444");
        list.remove(0);

        System.out.println(list.get(0));
    }
}
