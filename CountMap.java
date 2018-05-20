package homework4;

import java.util.Map;

/**
 * Created by 12 on 20.05.2018.
 */
public interface CountMap<E>   {

    void add (E elem); // добавляет элемент в этот контейнер;

    int getCount (E elem); // возвращает количество добавлений данного элемента;

    int remove (E elem); // удаляет элемент из контейнера и возвращает количество его добавлений (до удаления);

    int size(); // кол-во разных элементов;

  //  void addAll (CountMap<? extends  E> source);// добавить все элементы из source в текущий контейнер, при совпадении ключей, суммировать значения

    Map<E, Integer> toMap();// Вернуть java.util.Map. ключ - добавленный элемент, значение - количество его добавлений

    void toMap(Map<? super E, Integer> destination); //  //Тот же самый контракт как и toMap(), только всю информацию записать в destination

}
