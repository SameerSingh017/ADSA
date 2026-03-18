class Detail{
    String name;
    int height;
    Detail(String name, int height){
        this.name = name;
        this.height = height;
    }
}

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        List<Detail> list = new ArrayList<>();
        for(int i=0 ; i<n ; i++){
            list.add(new Detail(names[i],heights[i]));
        }
        Collections.sort(list ,(a,b) -> b.height - a.height);

        String[] result = new String[n];
        for(int i=0 ; i<n ; i++){
            result[i] = list.get(i).name;
        }

        return result;
    }
}