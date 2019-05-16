package com.learn.collection;

public class Linkedlist {

    private Node first;
    private Node last;
    private int size;


    public void add(Object obj){

        if (first==null){
            Node n = new Node();
            n.setPrevious(null);
            n.setObj(obj);
            n.setNext(null);
            first = n;
            last = n;
        }else {
            //直接往last后添加对象
            Node n = new Node();
            n.setPrevious(last);
            n.setObj(obj);
            n.setNext(null);
            last.setNext(n);
            last = n;

        }
        size++;
    }

    public int size(){
        return size;
    }


    public Object get(int index){

        //index 越界处理
        rangeCheck(index);

        Node temp = null;
        if (first!=null){
            temp=first ;
            for(int i=0;i<index;i++){
                temp = temp.getNext();
            }
        }
        return temp.getObj();
    }


    public void rangeCheck(int index){
        if(index<0||index>=size){
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void remove(int index){
        Node temp = null;
        if (first!=null){
            temp=first ;
            for(int i=0;i<index;i++){
                temp = temp.getNext();
            }
        }
        if (temp!=null){
         Node up = temp.getPrevious();
         Node down = temp.getNext();
         up.setNext(down);
         down.setPrevious(up);
        }

        size--;
    }

    public void add(int index,Object obj){
        Node temp = null;
        if (first!=null){
            temp=first ;
            for(int i=0;i<index;i++){
                temp = temp.getNext();
            }
        }

        Node newnode = new Node();
        newnode.setObj(obj);

        Node up = temp.getPrevious();
        up.setNext(newnode);
        newnode.setPrevious(up);


        newnode.setNext(temp);
        temp.setPrevious(newnode);
        size++;

    }

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add(3,"eee");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
    }

}


