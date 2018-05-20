package homework4;

import java.util.HashMap;
import java.util.Map;



    public class CountMapImpl<E> implements CountMap<E> {

        private Map<E, Integer> map = new HashMap<>();

        @Override
        public void add(E elem) {

            int currentCount = this.getCount(elem);
            map.put(elem, ++currentCount);
        }

        @Override
        public int getCount(E elem) {
            Integer count = map.get(elem);
            return count != null ? count : 0;
        }

        @Override
        public int size() {
            return map.size();
        }

        @Override
        public Map<E, Integer> toMap() {
            Map<E, Integer> newMap = new HashMap<>();
            newMap.putAll(map);
            return newMap;
        }

        @Override
        public void toMap(Map<? super E, Integer> destination) {
            destination.putAll(map);
        }

        @Override
        public int remove(E elem) {
            int currentCount = getCount(elem);
            if (currentCount == 1) {
                map.remove(elem);
            } else {
                map.put(elem, currentCount - 1);
            }
            return currentCount;
        }
    }


