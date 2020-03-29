package GreedyAlgorithms;

 class Decode {

	class MinHeapNode
	{
	    char data;
	    int freq;
	    MinHeapNode left, right, top;
	    MinHeapNode(char c, int freq)
	    {
	        left = right = null;
	        this.data = c;
	        this.freq = freq;
	    }
	}
	
	public static void main(String[] args) {
		
		
		Decode d = new Decode();
		MinHeapNode root = d.new MinHeapNode('#', 0);
		root.left = d.new MinHeapNode('#', 0);
		root.left.left = d.new MinHeapNode('b', 1);
		root.right = d.new MinHeapNode('a', 3);
		root.left.right = d.new MinHeapNode('c', 1);

		System.out.println(decodeHuffmanData(root, "1001011")); //abaca
	}
	
	static String decodeHuffmanData(MinHeapNode root, String binaryString)
    {
        
        String result = "";
        int index = 0;
        MinHeapNode currentNode = root;
        while(index < binaryString.length())
        {
        	if('0' == binaryString.charAt(index) && currentNode.left != null)
        	{
        		currentNode = currentNode.left;
        	}
        	 if('0' == binaryString.charAt(index) && currentNode.left == null)
        	{
        		result = result + currentNode.data;
        		currentNode = root;
        	}
        	if('1' == binaryString.charAt(index) && currentNode.right != null)
        	{
        		currentNode = currentNode.right;
        	}
        	if ('1' == binaryString.charAt(index) && currentNode.right == null)
        	{
        		result = result + currentNode.data;
        		currentNode = root;
        	}
        	
        	index++;
        }
        
        return result;
    }

}
