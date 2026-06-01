






class MyHashSet {
    int set[];
    int count;
    public MyHashSet() {
       set = new int[1];
    }

    public void add(int key){
     if(set.length==count){
         int newSet =  set.length*2;
         int[] newSetArray = new int[newSet];
         for(int i=0;i<count;i++){
             newSetArray[i]=set[i];
         }
         set=newSetArray;
     }
     set[count++] = key;
    }

    public void remove(int key) {
       for(int i=0;i<count;i++){
           if(set[i]==key){
                set[i]=0;
           }
       }
    }

    public boolean contains(int key) {
      for(int i=0;i<count;i++){
          if(key==set[i]){
              return true;
          }
      }
        return false;
    }
}
/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */