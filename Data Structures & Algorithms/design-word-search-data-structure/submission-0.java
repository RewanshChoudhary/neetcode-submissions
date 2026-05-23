class TrieNode {
    TrieNode [] children=new TrieNode[26];
    public boolean endOfWord;


}
class WordDictionary {
 private TrieNode root;

    public WordDictionary() {
        root=new TrieNode();

    }
    
    public void addWord(String word) {
        TrieNode curr=root;

        for (char c : word.toCharArray()){
            int i=c-'a';

            if(curr.children[i]==null) {
                curr.children[i]=new TrieNode();

            } 
            curr=curr.children[i];


        }
        curr.endOfWord=true;

        
        
    }
    public boolean dfs(String word ,int ci,TrieNode parent){
       for (int i=ci;i<word.length();i++){
        if (word.charAt(i)=='.'){
            for (TrieNode child : parent.children){
                if (child!=null &&  dfs(word,i+1,child)){
                    return true;

                }
               

            }
        return false;
    }
             else {
                    int j=word.charAt(i)-'a';
                    if (parent.children[j]==null) return false;
                    parent=parent.children[j];


                }

        
       }
       return parent.endOfWord;


    }
    
    public boolean search(String word) {
        return dfs(word,0,root);


        
    }
}


