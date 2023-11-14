public class Tree {

    private String treeType;
    private int age;
    private double height;
    private int numberOfBranches;
    private int totalLeaves;


    public Tree(String treeType, int age, double height, int numberOfBranches, int totalLeaves) {
        this.treeType = treeType;
        this.age = age;
        this.height = height;
        this.numberOfBranches = numberOfBranches;
        this.totalLeaves = totalLeaves;
    }


    public void grow(int years, double heightIncrease, int branchesIncrease, int leavesIncrease) {
        this.age += years;
        this.height += heightIncrease;
        this.numberOfBranches += branchesIncrease;
        this.totalLeaves += leavesIncrease;
        System.out.println("The tree has grown.");
    }


    public void shedLeaves(int leavesToShed) {
        if (leavesToShed <= totalLeaves) {
            totalLeaves -= leavesToShed;
            System.out.println(leavesToShed + " leaves have been shed from the tree.");
        } else {
            System.out.println("Error: Trying to shed more leaves than available.");
        }
    }


    public String getTreeInfo() {
        return "Tree Information: Type - " + treeType + ", Age - " + age + " years, Height - " + height +
                " meters, Branches - " + numberOfBranches + ", Leaves - " + totalLeaves;
    }

    // Main method for testing
    public static void main(String[] args) {

        Tree myTree = new Tree("SugarMaple", 10, 13.5, 10, 200);


        System.out.println("Initial Tree Information:");
        System.out.println(myTree.getTreeInfo());

        // Simulate growth for 3 years, increase height by 1.5 meters, branches by 5, and leaves by 100
        myTree.grow(3, 1.5, 5, 100);
        System.out.println("Tree Information after growth:");
        System.out.println(myTree.getTreeInfo());

        // Simulate shedding 50 leaves
        myTree.shedLeaves(50);
        System.out.println("Tree Information after shedding leaves:");
        System.out.println(myTree.getTreeInfo());
    }
}
