package bakeryorderingsystem;

public class Pastries extends BakeryOrderingSystem
{
    String name;
    String[] flavours;
    String[] sizes;
    double[] prices;

    public Pastries(String name, String[] flavours, String sizes[], double[] prices)
    {
        this.name = name;
        this.flavours = flavours;
        this.sizes = sizes;
        this.prices = prices;
    }
    
    public class Bread extends Pastries
    {
        String[] breadVarieties;
    
        public Bread() 
        {
            super("Bread", new String[]{"Cranberry & chocolate", "Wheat", "Pandan", "Multigrain", "Rye"},
                    new String[] {"6 Slices", "12 Slices"},
                    new double[]{0.5, 1.0});
                    

            this.breadVarieties = new String[]{"Cranberry & chocolate", "Wheat", "Pandan", "Multigrain", "Rye"};
        }
            public void printBreadTypes()
            {
                System.out.println("Available Bread types:");

                for (String type : this.breadVarieties)
                {
                    System.out.println("- " + type);
                }
            }

        public String[] getBreadVarieties()
        {
            return this.breadVarieties;
        }
   }
    
    public class Cake extends Pastries 
    {
        String[] cakeVarieties;

        public Cake() 
        {
            super("Cake", new String[]{"Hazelnut choc", "Vanilla","Strawberry", "Lemon", "Red Velvet"},
                    new String[]{"1 slice", "6 slices", "Whole cake"},
                    new double[]{5, 25.0, 45.0});

            this.cakeVarieties = new String[]{"Hazelnut choc", "Vanilla", "Strawberry", "Lemon", "Red Velvet"};
        }

        public void printCakeTypes() 
        {
            System.out.println("Available cake types:");
            
            for (String type : this.getCakeVarieties()) 
            {
                System.out.println("- " + type);
            }
        }

        public String[] getCakeVarieties() 
        {
            return this.cakeVarieties;
        }
    }
    
    public class Doughnut extends Pastries 
    {    
         String[] doughnutVarieties;

        public Doughnut() 
        {
            super("Doughnut", new String[]{"Glazed", "Chocolate", "Biscoff", "Onde-onde", "Cinnamon"}, 
                    new String[]{"1 doughnut", "6 doughnuts", "12 doughnuts"}, 
                    new double[]{4.0, 24.0, 42.0});

            this.doughnutVarieties = new String[]{"Glazed", "Chocolate", "Biscoff", "Onde-Onde", "Cinnamon"};
        }

        public void printDoughnutTypes() 
        {
            System.out.println("Available Doughnut types:");

            for (String type : this.getDoughnutVarieties()) 
            {
                System.out.println("- " + type);
            }
        }

        public String[] getDoughnutVarieties() 
        {
            return this.doughnutVarieties;
        }
    }
    
    public class Tart extends Pastries
    {  
         String[] tartVarieties;

        public Tart()
        {
            super("Tart", new String[]{"Fruit", "Chocolate", "Custard", "Egg", "Durian"},
                    new String[]{"10 pieces", "20 pieces", "50 Pieces"}, 
                    new double[]{12.0, 22.0, 33.0});
            
            this.tartVarieties = super.getFlavours();
        }

        public void printTartTypes() 
        {
            System.out.println("Available Tart types:");
            
            for (String type : this.getTartVarieties()) 
            {
                System.out.println("- " + type);
            }
        }

        public String[] getTartVarieties()
            {
                return this.tartVarieties;
            }
    }
    
    public class Puff extends Pastries 
    {  
        String[] puffVarieties;

        public Puff()
        {
            super("Puff", new String[]{"Cream Cheese", "Chocolate", "Cinnamon", "Fruit", "Plain"},
                    new String[]{"1 piece", "5 pieces", "10 pieces"}, 
                    new double[]{4.0, 19.0, 37.0});

            this.puffVarieties = super.getFlavours();
        }

        public void printPuffTypes()
        {
            System.out.println("Available Puff types:");
            for (String type : this.getTartVarieties())
            {
                System.out.println("- " + type);
            }
        }

        public String[] getTartVarieties() 
        {
            return this.puffVarieties;
        }
    }
    
    public String getName()
    {
        return name;
    }
    
    //input details of all pastries in here.
    public String[] getFlavours()
    {
        return flavours;
    }

    public String[] getSizes()
    {
        return sizes;
    }

    public double[] getPrices()
    {
        return prices;
    }
}
