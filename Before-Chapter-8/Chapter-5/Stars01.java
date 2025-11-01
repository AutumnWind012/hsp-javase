public class Stars01 {
	
    static void PrintTriangle(int level) {
    	for (int i = 0; i < level; ++i) {
        	for (int j = 0; j <= i; ++j) {
            	System.out.print("*");
        	}
            System.out.print("\n");
        }
    }
    
    static void PrintTriangleReverse(int level){
    	for (int i = level; i > 0; --i) {
        	for (int j = 0; j < i; ++j) {
            	System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
	static void PrintPyramid(int level) {
    	int space = level * 2 - 1;
    	for (int i = 1; i <= level; ++i) {
        	for (int j = 0; j <= level + i - 2; ++j) {
                if (j == level - i || j == level + i - 2 || i == level){
                	System.out.print("*");
                } else {
                	System.out.print(" ");
                }
            }
        	System.out.print("\n");
        }
    }

    static void PrintPyramidHan(int level) {
        int space = level * 2 - 1;
        // 一共 level 层
        for (int i = 1; i <= level; ++i) {
            // 先打印 level - i 个空格
            for (int j = 0; j < level - i; ++j) {
                System.out.print(" ");
            }
            // 打印 *
            for (int k = 0; k < i*2 - 1; ++k){
                System.out.print("*");
            } 
            System.out.print("\n");
        }
    }

    static void PrintEmptyPyramidHan(int level) {
        int space = level * 2 - 1;
        // 一共 level 层
        for (int i = 1; i <= level; ++i) {
            // 先打印 level - i 个空格
            for (int j = 0; j < level - i; ++j) {
                System.out.print(" ");
            }
            // 打印 *
            for (int k = 1; k <= i*2  - 1; ++k){
                if (k == 1 || k == i*2 - 1 || i == level){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            } 
            System.out.print("\n");
        }
    }
    
    static void PrintRhombus(int level) {
    	int space = level * 2 - 1;
    	for (int i = 1; i <= level; ++i) {
        	for (int j = 0; j <= level + i - 2; ++j) {
                if (j == level - i || j == level + i - 2){
                	System.out.print("*");
                } else {
                	System.out.print(" ");
                }
            }
        	System.out.print("\n");
        }
    	for (int i = level-1; i >= 1; --i) {
        	for (int j = 0; j <= level + i - 2; ++j) {
                if (j == level - i || j == level + i - 2){
                	System.out.print("*");
                } else {
                	System.out.print(" ");
                }
            }
        	System.out.print("\n");
        }
    }

    public static void main(String[] args) {
		PrintPyramid(20);
    }
}