

class LRUCache {
    int capacity;
    List<int[]> cache = new ArrayList<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;

    }

    public int get(int key) {
        int res = -1;

        for (int i = 0; i < cache.size(); i++) {
            if (cache.get(i)[0] == key) {
                res = cache.get(i)[1];
                int[] store = cache.get(i);
                cache.remove(i);
                cache.add(store);

                break;

            }
        }
        return res;

    }

    public void put(int key, int value) {
     for (int i = 0; i < cache.size(); i++) {
            if (cache.get(i)[0] == key) {
               
            
                cache.remove(i);
                cache.add(new int[]{key,value});


               return;


            }
        }
        if (capacity==cache.size()){
            cache.remove(0);
            

        }
        cache.add(new int[]{key,value});


    }
}
