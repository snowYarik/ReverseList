package com.linty.reverselist;

/*Развернуть односвязный список двумя способами: рекурсивным и без рекурсии.
Выполнить задачу на любом языке программирования.
Так, например, если у вас раньше был список с элементами 3, 15, 6,
то после разворота должен получиться список,
в котором сначала идёт 6, потом 15, а потом 3.*/
public class Main {

    public static void main(String[] args) {

        MyList listWithRec = new MyList();

        listWithRec.addElement(1);
        listWithRec.addElement(2);
        listWithRec.addElement(3);

        listWithRec.printList();
        listWithRec.recursReverse(listWithRec.getHead(), listWithRec.getNext());
        listWithRec.printList();

        System.out.println();

        MyList listWithoutRec = new MyList();

        listWithoutRec.addElement(4);
        listWithoutRec.addElement(5);
        listWithoutRec.addElement(6);
        listWithoutRec.addElement(7);
        listWithoutRec.printList();
        
        listWithoutRec.deleteElement(7);
        listWithoutRec.printList();

        listWithoutRec.printList();
        listWithoutRec.nonRecursReverse();
        listWithoutRec.printList();
    }
}
