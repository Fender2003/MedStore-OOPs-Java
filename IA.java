import java.util.*;
import java.io.*;
import java.lang.*;
import java.awt.Desktop;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;



class OurShop
{
    Scanner sc = new Scanner(System.in);

    ArrayList<String> final_prodcuts = new ArrayList<String>();
    ArrayList<Integer> final_price = new ArrayList<Integer>();
    double total = 0;

    void Cart()
    {

        for(int i=0; i<final_price.size(); i++)
        {
            System.out.print(final_prodcuts.get(i));
            System.out.println("            " + final_price.get(i));
            total+=final_price.get(i);
            
        }
            
        if(total>=1500 && total<3000)
        {
            total = total*0.9;
            System.out.println("Congratulations you got a 10% discount on purchase of more than 1500Rs");
        }
        else if(total>=3000)
        {
            total = total*0.75;
            System.out.println("Congratulations you got a 10% discount on purchase of more than 3000Rs");
    
        }
    
        System.out.print("Do you have a coupen code yes(1) or No(0): ");
        int response = sc.nextInt();
        if(response == 1)
        {
            System.out.println("Enter the coupen code: ");
            int coup_code = sc.nextInt();
            if(coup_code==59876)
            {
                total = total*0.6;
                System.out.println("Congratulations you have got a discount of 40% on your total purchase!");
            }
            else
                System.out.println("Sorry the coupon code entered is wrong!");
        }
    
        System.out.println("Total =                                                    "+total);
        System.exit(0);
        

    }
    void BabyCare()
    {
        String[] BCP = {"Pampers Diaper", "Nestle Nan Pro Formula", "Sebamed Sun Lotion 50+ ", "Wet Wipes", "Sebamed Baby Lotion", "Woodwards Grip Water", "Feeding Bottle", "Baby Massage Oil", "Sebamed Gental Body Wash", "Johnson's Baby Shampoo"};
        int[] priceBCP = {700, 615, 1000, 252, 500, 100, 199, 100, 550, 100};
        
        System.out.println("Enter the product you want to buy??");

        System.out.println("                                                   --------------------------------------------------------------------      ");
        System.out.println("                                                   | P_NO             PRODUCT                 |          PRICE        |      ");
        System.out.println("                                                   |------------------------------------------------------------------|      ");
        System.out.println("                                                   | (1)      Pampers Diaper                  |          Rs 700       |      "); 
        System.out.println("                                                   | (2)      Nestle Nan Pro Formula          |          Rs 615       |      ");
        System.out.println("                                                   | (3)      Sebamed Sun Lotion 50+          |          Rs 1000      |      ");
        System.out.println("                                                   | (4)      Wet Wipes                       |          Rs 252       |      ");
        System.out.println("                                                   | (5)      Sebamed Baby Lotion             |          Rs 500       |      ");
        System.out.println("                                                   | (6)      Woodwards Grip Water            |          Rs 100       |      ");
        System.out.println("                                                   | (7)      Feeding Bottle                  |          Rs 199       |      ");
        System.out.println("                                                   | (8)      Baby Massage Oil                |          Rs 100       |      ");
        System.out.println("                                                   | (9)      Sebamed Gental Body Wash        |          Rs 550       |      ");
        System.out.println("                                                   | (10)     Johnson's Baby Shampoo          |          Rs 100       |      ");
        System.out.println("                                                   --------------------------------------------------------------------      ");

        System.out.println("Enter the number of products you want to buy: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++)
        {
            int BCP_num;
            System.out.println("Enter the product number: ");
            BCP_num = sc.nextInt();

            int quan;
            System.out.println("Enter the quantity of "+ BCP[BCP_num - 1] + " you want to buy");
            quan = sc.nextInt();

            System.out.println(BCP[BCP_num - 1]);
            final_prodcuts.add((String)BCP[BCP_num - 1]);
            final_price.add(quan * priceBCP[BCP_num - 1]);
        }

    }

    void HealthCare()
    {
        String[] HC = {"Panadol", "Panadol", "Odimont LC ", "Benedryl Cough Syrup", "Brillinta", "Cheston cold tablet", "Crocin", "Ryzodeg", "Peroclin", "Differin"};
        int[] priceHC = {70, 50, 75, 100, 700, 25, 40, 100, 70, 40};

        System.out.println("Enter the product you will like to buy??");
        System.out.println("                                                  --------------------------------------------------------------------");
        System.out.println("                                                  |                 PRODUCT                  |            PRICE      |");
        System.out.println("                                                  | ------------------------------------------------------------------");
        System.out.println("                                                  | (1)     Panadol(Fever)                   |            Rs 70      |");
        System.out.println("                                                  | (2)     Panadol(Joint Pain)              |            Rs 50      |");
        System.out.println("                                                  | (3)     Odimont LC                       |            Rs 75      |");
        System.out.println("                                                  | (4)     Benedryl Cough Syrup             |            Rs 100     |");
        System.out.println("                                                  | (5)     Brillinta                        |            Rs 700     |");
        System.out.println("                                                  | (6)     Cheston cold tablet              |            Rs 25      |");
        System.out.println("                                                  | (7)     Crocin                           |            Rs 40      |");
        System.out.println("                                                  | (8)     Ryzodeg                          |            Rs 100     |");
        System.out.println("                                                  | (9)     Peroclin                         |            Rs 70      |");
        System.out.println("                                                  | (10)    Differin                         |            Rs 40      |");
        System.out.println("                                                  --------------------------------------------------------------------");
    
        System.out.println("Enter the number of products you want to buy: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++)
        {
            int HP_num;
            System.out.println("Enter the product number: ");
            HP_num = sc.nextInt();

            int quan;
            System.out.println("Enter the quantity of "+ HC[HP_num - 1] + " you want to buy");
            quan = sc.nextInt();


            System.out.println(HC[HP_num - 1]);
            final_prodcuts.add(HC[HP_num - 1]);
            final_price.add(quan * priceHC[HP_num - 1]);
        }
    }
    
    void WomenCare()
    {
        String[] WCP = {"Sanitizer Pad", "Pregnency Kit", "Revital H Tablets ", "V Wash Plus", "Contraceptive Pill", "Menstrual Cup", "Protinex Vanilla Powder", "Hair Razor", "Women Tampons", "Pee Disposable Urination Device"};
        int[] priceWCP = {150,60, 360, 200, 100, 250, 499, 99, 250, 375};
        
        System.out.println("Enter the product you want to buy??");
        System.out.println("                                                   --------------------------------------------------------------------      ");
        System.out.println("                                                   | P_NO             PRODUCT                 |          PRICE        |      ");
        System.out.println("                                                   |------------------------------------------------------------------|      ");
        System.out.println("                                                   | (1)      Sanitizer Pad                   |          Rs 150       |      "); 
        System.out.println("                                                   | (2)      Pregnancy Kit                   |          Rs 60        |      ");
        System.out.println("                                                   | (3)      Revital H Tablets               |          Rs 360       |      ");
        System.out.println("                                                   | (4)      V Wash Plus                     |          Rs 200       |      ");
        System.out.println("                                                   | (5)      Contraceptive Pill              |          Rs 100       |      ");
        System.out.println("                                                   | (6)      Menstrual Cup                   |          Rs 250       |      ");
        System.out.println("                                                   | (7)      Protinex Vanilla Powder         |          Rs 499       |      ");
        System.out.println("                                                   | (8)      Hair Razor                      |          Rs 99        |      ");
        System.out.println("                                                   | (9)      Women Tampons                   |          Rs 250       |      ");
        System.out.println("                                                   | (10)     Pee Disposable Urination Device |          Rs 375       |      ");
        System.out.println("                                                   --------------------------------------------------------------------      ");

        System.out.println("Enter the number of products you want to buy: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            int WCP_num;
            System.out.println("Enter the product number: ");
            WCP_num = sc.nextInt();

            int quan;
            System.out.println("Enter the quantity of "+ WCP[WCP_num - 1] + " you want to buy");
            quan = sc.nextInt();


            System.out.println(WCP[WCP_num - 1]);
            final_prodcuts.add((String)WCP[WCP_num - 1]);
            final_price.add(quan * priceWCP[WCP_num - 1]);
        }

    }
    void PopularProducts()
    {
        String[] PP = {"Sanitizer Pad", "Fedding Bottle", "Panadol(Fever)", "V Wash Plus",  "Complete Blood Test", "Sebamed Sun Lotion 50+(300ML)", "Oximeter", "Crocin", "Face Mask", "Pee Disposable Urination Device"};
        int[] pricePP= {150,199, 360, 200, 100, 150, 499, 99, 250, 375};
        
        System.out.println("Enter the product you want to buy??");
        System.out.println("                 🎊 🎊---------------------------FEW BEST SELLERS---------------------🎊 🎊       ");
        System.out.println("(1)Sanitizer Pad(100 PADS)          ----------------LESS COST MORE QUANTITY !!!!!--------------------Rs 150");
        System.out.println("(2)Fedding Bottle                   ----------------HIGH QUALITY COST EFFECTIVE----------------------Rs 199");
        System.out.println("(3)Panadol(Fever)                   ----------------PRICE JUST DROPPED !!!!!!------------------------Rs 360");
        System.out.println("(4)V Wash Plus                      ----------------HYGIENE IS IMPORTANT DONT THINK MUCH-------------Rs 200");
        System.out.println("(5)Complete Blood Test              ----------------OFFER GOING ON MAJOR PRICE DROP !!!!!------------Rs 100");
        System.out.println("(6)Sebamed Sun Lotion 50+(300ML)    ----------------LESS COST MORE QUANTITY !!!!!------------------- Rs 150");                   
        System.out.println("(7)Oximeter                         ----------------HIGH QUALITY DONT THINK MUCH---------------------Rs 499");
        System.out.println("(8)Crocin                           ----------------MAJOR PRICE DROP!!!!!----------------------------Rs 099");
        System.out.println("(9)Face Mask                        ----------------GET MORE PRODUCT-------------------------------- Rs 250");
        System.out.println("(10)Pee Disposable Urination Device ----------------*****TRAVEL EFFECTIVE*****---------------------- Rs 375");

        System.out.println("Enter the number of products you want to buy:");
        int n = sc.nextInt();

        for(int i=0; i<n; i++)
        {
            int PP_num;
            System.out.println("Enter the product number: ");
            PP_num = sc.nextInt();

            int quan;
            System.out.println("Enter the quantity of "+ PP[PP_num - 1] + " you want to buy");
            quan = sc.nextInt();
            
            System.out.println(PP[PP_num - 1]);
            final_prodcuts.add(PP[PP_num - 1]);
            final_price.add(quan * pricePP[PP_num - 1]);
        }
    }

    void PersonalCare()
    {
        String[] PCP = {"Godrej Hair color", "Dove Hairfall Rescue shampoo", "Philips Aqua Touch electric Razor", "Parachute Hair Oil", "Livon Anti-frizz Hair Serum", "Pond's Lavender Powder", "Clean and Clear Face Wash", "Dabur Meswak Toothpaste", "Head and Shoulders Smooth Hair Shampoo", "Loreal Paris Conditioner"};
        int[] pricePCP = {150, 240, 1100, 140, 400, 90, 75, 125, 250, 300};

        System.out.println("Enter the product you want to buy??");
        System.out.println("                                                   --------------------------------------------------------------------      ");
        System.out.println("                                                   | P_NO             PRODUCT                 |          PRICE        |      ");
        System.out.println("                                                   |------------------------------------------------------------------|      ");
        System.out.println("                                                   | (1)      Godrej Hair Color               |          Rs 150       |      "); 
        System.out.println("                                                   | (2       Dove Hairfall Rescue Shampoo    |          Rs 240       |      ");
        System.out.println("                                                   | (3)      Philips Aqua electric Razor     |          Rs 1100      |      ");
        System.out.println("                                                   | (4)      Parachute Hair Oil              |          Rs 140       |      ");
        System.out.println("                                                   | (5)      Livon Anti-frizz Hair Serum     |          Rs 400       |      ");
        System.out.println("                                                   | (6)      Pond's Lavender Powder          |          Rs 90        |      ");
        System.out.println("                                                   | (7)      Clean and Clear Face Wash       |          Rs 75        |      ");
        System.out.println("                                                   | (8)      Dabur Meswak Toothpaste         |          Rs 125       |      ");
        System.out.println("                                                   | (9)      Head and Shoulders Hair Shampoo |          Rs 250       |      ");
        System.out.println("                                                   | (10)     Loreal Paris Conditioner        |          Rs 300       |      ");
        System.out.println("                                                   --------------------------------------------------------------------      ");
        
        System.out.println("Enter the number of products you want to buy: ");
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++)
        {
            int PCP_num;
            System.out.println("Enter the product number: ");
            PCP_num = sc.nextInt();

            int quan;
            System.out.println("Enter the quantity of "+ PCP[PCP_num - 1] + " you want to buy");
            quan = sc.nextInt();

            System.out.println(PCP[PCP_num - 1]);
            final_prodcuts.add(PCP[PCP_num - 1]);
            final_price.add(quan * pricePCP[PCP_num - 1]);
        }
    }
    void HealthDevice()
    {
        String[] HDP = {"Apollo Digital Thermometer", "Accu-check Blood Glucose Test Strip", "Accu-check Oximeter", "Flamingo Heating Pad", "Flamingo Cool Gel Pad", "Ez-life Blood Pressure Monitor", "Orthopedic Neck Belt", "Accu-check Blood Glucose Monitor", "Apollo Nebulizer", "Apollo Weighing Machine"};
        int[] priceHDP = {150, 199, 250, 400, 350, 599, 250, 350, 299, 699};
        
        System.out.println("Enter the number of products you want to buy: ");
        System.out.println("                                                   --------------------------------------------------------------------      ");
        System.out.println("                                                   | P_NO             PRODUCT                 |          PRICE        |      ");
        System.out.println("                                                   |------------------------------------------------------------------|      ");
        System.out.println("                                                   | (1)      Apollo Digital Thermometer      |          Rs 150       |      "); 
        System.out.println("                                                   | (2)      Accu Blood Glucose Test Strip   |          Rs 199       |      ");
        System.out.println("                                                   | (3)      Accu-check Oximeter             |          Rs 250       |      ");
        System.out.println("                                                   | (4)      Flamingo Heating Pad            |          Rs 400       |      ");
        System.out.println("                                                   | (5)      Flamingo Cool Gel Pad           |          Rs 350       |      ");
        System.out.println("                                                   | (6)      Ez-life Blood Pressure Monitor  |          Rs 599       |      ");
        System.out.println("                                                   | (7)      Orthopedic Neck Belt            |          Rs 250       |      ");
        System.out.println("                                                   | (8)      Accu Blood Glucose Monitor      |          Rs 350       |      ");
        System.out.println("                                                   | (9)      Apollo Nebulizer                |          Rs 299       |      ");
        System.out.println("                                                   | (10)     Apollo Weighing Machine         |          Rs 699       |      ");
        System.out.println("                                                   --------------------------------------------------------------------      ");


        System.out.println("Enter the number of products you want to buy: ");
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++)
        {
            int HDP_num;
            System.out.println("Enter the product number: ");
            HDP_num = sc.nextInt();

            int quan;
            System.out.println("Enter the quantity of "+ HDP[HDP_num - 1] + " you want to buy");
            quan = sc.nextInt();
            
            System.out.println(HDP[HDP_num - 1]);
            final_prodcuts.add(HDP[HDP_num - 1]);
            final_price.add(quan * priceHDP[HDP_num - 1]);

        }
           
    }
    void pharma()
    {
        int sel;
        Scanner sc = new Scanner(System.in);
        boolean flag1 = true;
        
        while(true)
        {
            System.out.println(ConsoleColors.CYAN+"-----------------------------------------------------------------------------------------------------------------------------------------------------------\n"+ConsoleColors.RESET);
            System.out.println(ConsoleColors.YELLOW+"                                                                            PHARMACY :                                                                              \n"+ConsoleColors.RESET);
            System.out.println(ConsoleColors.CYAN+"------------------------------------------------------------------------------------------------------------------------------------------------------------\n"+ConsoleColors.RESET);
            System.out.println(ConsoleColors.CYAN+"                                                                         (1) Baby Care "            +ConsoleColors.RESET);
            System.out.println(ConsoleColors.CYAN+"                                                                         (2) Health Care(Medicines)"+ConsoleColors.RESET);
            System.out.println(ConsoleColors.CYAN+"                                                                         (3) Personal Care "        +ConsoleColors.RESET);
            System.out.println(ConsoleColors.CYAN+"                                                                         (4) Health Device "        +ConsoleColors.RESET);
            System.out.println(ConsoleColors.CYAN+"                                                                         (5) Women Care    "        +ConsoleColors.RESET);
            System.out.println(ConsoleColors.CYAN+"                                                                         (6) Some popular products" +ConsoleColors.RESET); 
            System.out.println(ConsoleColors.CYAN+"                                                                         (7) Home Page\n"           +ConsoleColors.RESET);       
            sel = sc.nextInt();
            switch(sel)
            {
                case(1):
                    BabyCare();
                    break;
                case(2):
                    HealthCare();
                    break;
                case(3):
                    PersonalCare();
                    break;
                case(4):
                    HealthDevice();
                    break;
                case(5):
                    WomenCare();
                    break;
                case(6):
                    PopularProducts();
                case(7):
                        flag1 = false;
                        break;
                    
                
                default:
                    System.out.println("wrong choice");
            }
            if(!flag1)
                break;
            
        }
    }
    void doctor_consultancy()
    {    
        System.out.println("                                                  Please note appointment of specialists are taken for given month only      ");
        System.out.println("                                                   --------------------------------------------------------------------      ");
        System.out.println("                                                   | S_NO          SPECIALIST                 |          PRICE        |      ");
        System.out.println("                                                   |------------------------------------------------------------------|      ");
        System.out.println("                                                   | (1)      Dermatologist                   |          Rs 500       |      "); 
        System.out.println("                                                   | (2)      Paediatrics                     |          Rs 500       |      ");
        System.out.println("                                                   | (3)      General Physician               |          Rs 500       |      ");
        System.out.println("                                                   | (4)      Cardiologist                    |          Rs 1200      |      ");
        System.out.println("                                                   | (5)      Dentist                         |          Rs 350       |      ");
        System.out.println("                                                   | (6)      Oncologist                      |          Rs 1200      |      ");
        System.out.println("                                                   | (7)      Opthalmologist                  |          Rs 500       |      ");                                                 
        System.out.println("                                                   --------------------------------------------------------------------      ");
        String[] specialist = {"Dermatologist", "Paediatrics", "General Physician" , "Cardiologist" ,"Dentist", "Oncologist", "Opthalmologist"};
        int[] priceDOC = {500, 500, 500, 1200, 350, 1200, 500};
        System.out.println("Which specialist you will like to visit ?\n ");
        int doc = sc.nextInt();
        System.out.println("-------------LETS BOOK APPOINTMENT----------");
        System.out.println("------------------CALENDER :----------------");
        // Display message only
        
        // repeat:
        // {
            System.out.print("Enter the year(YYYY) : ");
            // Reading integer input value
            int yy = sc.nextInt();
            // if(yy<2022)
            // {
            //     System.out.println("choose the correct month!");
                 //continue repeat;
            // }
    
            // Display message only
            System.out.print("Enter month (MM) : ");
            int mm = sc.nextInt();
            // if(mm>12)
            // {
            //     System.out.println("choose the correct month!");
            //     continue repeat;
            // }

        //}
  
        int d = 1;
        int m = 1;
        int y = 1;
        int dy = 1;
  
        // Storing data and months as input
        String day[] = { "SUN", "MON", "TUE", "WED","THU", "FRI", "SAT" };
        String month[]
            = { "JANUARY", "FEBRUARY", "MARCH",
                "APRIL",   "MAY",      "JUNE",
                "JULY",    "AUGUST",   "SEPTEMBER",
                "OCTOBER", "NOVEMBER", "DECEMBER" };
  
        // Custom array as input
        int ar[] = { 31, 29, 31, 30, 31, 30,
                     31, 31, 30, 31, 30, 31 };
  
        // Till condition holds true
        while (true) {
  
            if (d == 1 && m == mm && y == yy) {
                break;
            }
  
            if (y % 4 == 0 && y % 100 != 0
                || y % 100 == 0) {
                ar[1] = 29;
            }
  
            else {
                ar[1] = 28;
            }
            dy++;
            d++;
  
            if (d > ar[m - 1]) {
                m++;
                d = 1;
            }
  
            if (m > 12)
            {
                m = 1;
                y++;
            }
  
            if (dy == 7) {
                dy = 0;
            }
        }
  
        int c = dy;
  
        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
            ar[1] = 29;
        }
        else {
            ar[1] = 28;
        }
  
        // Print the desired month of input year
        System.out.println("Month:" + month[mm - 1]);
  
        for (int k = 0; k < 7; k++) {
            System.out.print("   " + day[k]);
        }
  
        System.out.println();
  
        for (int j = 1; j <= (ar[mm - 1] + dy); j++) {
            if (j > 6) {
                dy = dy % 6;
            }
        }
  
        int spaces = dy;
        if (spaces < 0)
            spaces = 6;
  
        // Printing the calendar
        for (int i = 0; i < spaces; i++)
            System.out.print("      ");
        for (int i = 1; i <= ar[mm - 1]; i++) 
        {
            System.out.printf(" %4d ", i);
  
            if (((i + spaces) % 7 == 0)
                || (i == ar[mm - 1]))
                System.out.println();
        }
        int date;
        System.out.print("Enter the date of the current month you want the appointment: (DD MM)");
        date = sc.nextInt();
        System.out.println("You have a registered appointment  on " + date + " of "+month[mm - 1]+"  with " + specialist[doc-1]);
        final_prodcuts.add(specialist[doc-1]);
        final_price.add(priceDOC[doc-1]);  
    }
    void lab_test()
    {
        System.out.println("Choose the lab tests you want to do: ");
        System.out.println("                                                  Please note appointment of specialists are taken for given month only      ");
        System.out.println("                                                   --------------------------------------------------------------------      ");
        System.out.println("                                                   | L_NO         LAB TEST                    |          PRICE        |      ");
        System.out.println("                                                   |------------------------------------------------------------------|      ");
        System.out.println("                                                   | (1)      Complete Blood test             |          Rs 500       |      "); 
        System.out.println("                                                   | (2)      Covid                           |          Rs 500       |      ");
        System.out.println("                                                   | (3)      Dengue                          |          Rs 500       |      ");
        System.out.println("                                                   | (4)      Maleria                         |          Rs 1200      |      ");
        System.out.println("                                                   | (5)      Vitamins                        |          Rs 350       |      ");
        System.out.println("                                                   | (6)      Blood sugar test                |          Rs 1200      |      ");
        System.out.println("                                                   | (7)      Liver test                      |          Rs 500       |      ");
        System.out.println("                                                   --------------------------------------------------------------------      ");
        
        String[] test_list = {"Complete Blood test", "Covid", "Dengue" , "Maleria" ,"Vitamins", "(6)Blood sugar test", "Liver test"};
        int[] test_price = {500, 500, 500, 1200, 350, 1200, 500};
        System.out.print("Enter the number of lab test you want to take: ");
        
        int n = sc.nextInt();
        for(int i=0; i<n; i++)
        {       
            System.out.println("Enter the lab test number: ");
            int test_num = sc.nextInt();
            System.out.println(test_list[test_num - 1]);
            final_prodcuts.add(test_list[test_num - 1]);
            final_price.add(test_price[test_num-1]);
        }


        System.out.println("-------------LETS BOOK APPOINTMENT----------");
        System.out.println("------------------CALENDER :----------------");
        // Display message only
        System.out.print("Enter the year(YYYY) : ");
  
        // Reading integer input value
        int yy = sc.nextInt();
  
        // Display message only
        System.out.print("Enter month (MM) : ");
  
        // Reading integer input value
        int mm = sc.nextInt();
  
        int d = 1;
        int m = 1;
        int y = 1;
        int dy = 1;
  
        // Storing data and months as input
        String day[] = { "SUN", "MON", "TUE", "WED","THU", "FRI", "SAT" };
        String month[]
            = { "JANUARY", "FEBRUARY", "MARCH",
                "APRIL",   "MAY",      "JUNE",
                "JULY",    "AUGUST",   "SEPTEMBER",
                "OCTOBER", "NOVEMBER", "DECEMBER" };
  
        // Custom array as input
        int ar[] = { 31, 29, 31, 30, 31, 30,
                     31, 31, 30, 31, 30, 31 };
  
        // Till condition holds true
        while (true) {
  
            if (d == 1 && m == mm && y == yy) {
                break;
            }
  
            if (y % 4 == 0 && y % 100 != 0
                || y % 100 == 0) {
                ar[1] = 29;
            }
  
            else {
                ar[1] = 28;
            }
            dy++;
            d++;
  
            if (d > ar[m - 1]) {
                m++;
                d = 1;
            }
  
            if (m > 12) {
                m = 1;
                y++;
            }
  
            if (dy == 7) {
                dy = 0;
            }
        }
  
        int c = dy;
  
        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
            ar[1] = 29;
        }
        else {
            ar[1] = 28;
        }
  
        // Print the desired month of input year
        System.out.println("Month:" + month[mm - 1]);
  
        for (int k = 0; k < 7; k++) {
            System.out.print("   " + day[k]);
        }
  
        System.out.println();
  
        for (int j = 1; j <= (ar[mm - 1] + dy); j++) {
            if (j > 6) {
                dy = dy % 6;
            }
        }
  
        int spaces = dy;
        if (spaces < 0)
            spaces = 6;
  
        // Printing the calendar
        for (int i = 0; i < spaces; i++)
            System.out.print("      ");
        for (int i = 1; i <= ar[mm - 1]; i++) {
            System.out.printf(" %4d ", i);
  
            if (((i + spaces) % 7 == 0) || (i == ar[mm - 1]))
                System.out.println();
        }
        int date;
        System.out.print("Enter the date of the current month you want the appointment: (DD MM)");
        date = sc.nextInt();
        System.out.println("You have a registered appointment  on " + date + " of "+month[mm - 1]);
        
        
    
    }

    //X-X-X
    void benefits_amla()
    {
        System.out.println("                                     ---------------------------------------AMLA BENEFITS--------------------------------------------\n");
        System.out.println("                          Amla, commonly known as Indian gooseberry, is used for thousands of years in Ayurvedic medicine to treat illnesses.");
        System.out.println("                          Antioxidants , vitamins , amino acids , minerals , poly - phenols , and dietary fibre are abundant in amla berries.");
        System.out.println("                          This wonderful fruit, whether consumed fresh or dried,may do wonders for your complexion,hair,and general wellness.");
        System.out.println("                          Vitamin C , which is abundant in amla and supports immune system health . It  lessens inflammation and cell damage.");
        System.out.println("                          Additionally , it aids in the production of immune cells and antibodies that fight diseases.");
        System.out.println("                          Amla being antioxidants  improves brain function and memory. ");
        System.out.println("                          Amla is abundant in vital fatty acids, amino acids, tannins, and vitamin C, all of which nourish the hair.");
        System.out.println("                          Amla oil helps support the health of the hair follicles and stop the buildup of dandruff.");
        System.out.println("                          It is also regarded as the greatest fruit for preventing ageing. ");
        System.out.println("                          The skin becomes tight and velvety because of its high collagen protein content.");
        System.out.println("                          Amla is a fantastic source of fibre, which helps control bowel motions and treat digestive issues like diarrhoea or constipation.");
        System.out.println("                          It contains a lot of iron, which helps the body produce more red blood cells.");
    }
    void copper_bottle()
    {
        System.out.println("                                   ------------------------WATER IN COPPER BOTTLE - MUCH HEALTHIER AND BETTER-------------------------\n");
        System.out.println("                          For the body, drinking enough water is essential. There are many advantages to getting enough water to drink. :");
        System.out.println("                          The following happens when you drink more water. ");
        System.out.println("                          Helps the body eliminate toxins, regulates body temperature, maintains healthy, hydrated skin, and other health issues.");
        System.out.println("                          The ideal vessel for drinking water is a copper bottle.");
        System.out.println("                          Anti-inflammatory and antioxidant benefits of copper are only a few of its many health advantages.");
        System.out.println("                          Our bodies require copper in order to function properly. Copper is a necessary mineral.");
        System.out.println("                          It aids in detoxification, controlling body temperature, and maintaining hydrated, healthy skin.");
        System.out.println("                          Drinking water from copper bottle containers can therefore help us consume more of this crucial element.");
        System.out.println("                          While drinking from copper-colored cups has several advantages, it's crucial to remember that copper can be harmful in large concentrations.");
        System.out.println("                          Because of this, it's crucial to use copper containers solely for drinking water and not for keeping other liquids like milk or juice.");
        System.out.println("                          Additionally, it's crucial to routinely clean the copper vessel with salt and lemon to avoid copper deposits accumulating.");
        System.out.println("                          Use only soft cleaning tools, like sponges or cloths, to avoid scratching the vessel's surface.");
        System.out.println("                          We advise utilising a copper container to store and drink water if you want to improve your general health.");
    }
    void monsoon_tips()
    {
        System.out.println("                             -------------------------------WANNA STAY HEALTHY DURING MONSOON ??: FEW TIPS-------------------------\n");
        System.out.println("                          Amla, commonly known as Indian gooseberry, has been used for thousands of years in Ayurvedic medicine to treat and prevent illnesses.");
        System.out.println("                          Antioxidants, vitamins, amino acids, minerals, polyphenols, and dietary fibre are abundant in amla berries.");
        System.out.println("                          This wonderful fruit, whether consumed fresh or dried, may do wonders for your complexion, hair, and general wellness.");
        System.out.println("                          Vitamin C, which is abundant in amla and supports immune system health. Vitamin C is an antioxidant that lessens inflammation and cell damage.");
        System.out.println("                          Additionally, it aids in the production of immune cells and antibodies that fight diseases.");
        System.out.println("                          Amla being antioxidants  improves brain function and memory. ");
        System.out.println("                          Amla is abundant in vital fatty acids, amino acids, tannins, and vitamin C, all of which nourish the hair.");
        System.out.println("                          Amla oil helps support the health of the hair follicles and stop the buildup of dandruff. It is also regarded as the greatest fruit for preventing ageing. ");
        System.out.println("                          The skin becomes tight and velvety because of its high collagen protein content.");
        System.out.println("                          Amla is a fantastic source of fibre, which helps control bowel motions and treat digestive issues like diarrhoea or constipation.");
        System.out.println("                          It contains a lot of iron, which helps the body produce more red blood cells.");
    }
    
    void feedback()
    {
        try
          {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI u = new URI("https://docs.google.com/forms/d/e/1FAIpQLSdsLIOkQVLyxynEbXRfyGA-0Soc34yIJcPUdjahQAkCnkp7rw/viewform");
            desktop.browse(u);
          } catch (Exception e) 
          {
            e.printStackTrace();
          }
    }
    void Blogs()
    {

        int choice;
        Scanner sc = new Scanner(System.in);
        boolean flag2 = true ;
        while(true)
        {        
            System.out.println(ConsoleColors.CYAN+"                                                                (1) Amla Benefits                                                       "+ConsoleColors.RESET);
            System.out.println(ConsoleColors.CYAN+"                                                                (2) Water in Copper Bottle - Much Healthier and Better        "+ConsoleColors.RESET);
            System.out.println(ConsoleColors.CYAN+"                                                                (3) Wanna Stay Healthy During Monsoon ??  :  Few Tips                    "+ConsoleColors.RESET);
            System.out.println(ConsoleColors.CYAN+"                                                                (4) Home Page                                              "+ConsoleColors.RESET);
            choice = sc.nextInt();
            switch(choice)
            {
                case(1):
                benefits_amla();
                    break;
                case(2):
                    copper_bottle();
                    break;
                case(3):
                    monsoon_tips();
                    break;
                case(4):
                    flag2=false;
                    break;
                default:
                    System.out.println("WRONG INPUT");
                    break;
            }
            if(!flag2)
                break;
        }  
        System.out.println("WE WOULD LIKE TO TAKE A FEEDBACK FROM YOU GUYSSS!!!");
        feedback();

    }
}

// class Bill extends OurShop
// {

// }



class ConsoleColors
{
    // Reset
    public static final String RESET = "\033[0m";  // Text Reset

    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE
}



class IA
{
    Scanner sc = new Scanner(System.in);
    public void createLogin()throws IOException
    {
        // String fileName = "Login.txt";

            System.out.println(ConsoleColors.PURPLE+"                                                                          LOGIN PAGE!"+ConsoleColors.RESET);
            System.out.println("                                                                      (1)Existing User");
            System.out.println("                                                                      (2)New User");
            int choose;
            choose = sc.nextInt();
            switch(choose)
            {
                case(1):
                    Username();
                    break;
                case(2):
                    NewUser();
                    break;
            }
        
    }
    public void Username()throws IOException
    {
        Scanner sc1 = new Scanner(System.in);

        System.out.print("                                                                      Username: ");
        String user = sc1.nextLine();
        int n;
        System.out.print("                                                                      Password: ");
        String password = sc1.nextLine();
        boolean flag = true;
        // try
        // {
            File file = new File("Login.txt");
            Scanner sc3 = new Scanner(file);
            // StringBuffer sb = new StringBuffer();
            int x=0;
            int i=0;
            // String temp2;
            while(sc3.hasNextLine())
            {

            String temp = sc3.nextLine();
            //System.out.println(temp+" "+user);
                if(temp.compareTo(user)==0 && i%2==0)
                {//System.out.println("WELCOME!\n");
                    x = i;
                }
                // if(x+1==i)
                //     temp2 = temp;
                if(x+1==i && i!=1)
                {
                    // System.out.println(temp+password);

                    // String temp2 = temp;
                    // File file1 = new File("Login.txt");
                    // Scanner sc4 = new Scanner(file1);
                    // StringBuffer sb2 = new StringBuffer();
                    // while(sc4.hasNextLine())
                    // {
                        if(temp.compareTo(password)==0)
                        {
                            System.out.println(ConsoleColors.PURPLE+"                                                                      SUCCESSFULLY LOGGED IN"+ConsoleColors.RESET);
                            return;
                        }
                        else
                        {
                            System.out.println(ConsoleColors.PURPLE+"                                                                      Wrong Password"+ConsoleColors.RESET);
                            flag = false;
                            
                        }
                    // }
                    // else
                    // {
                    //     System.out.println("Wrong username or Password");
                    //     Username();
                    // }

                }                
                // System.out.println(x+" "+i);

                i++;

            }
            if(x==0)
            {
                System.out.println(ConsoleColors.PURPLE+"                                                                      No such user exists\n"+ConsoleColors.RESET);
                int ns;
                System.out.print(ConsoleColors.PURPLE+"                                                                      Do you want to make an Accout(1/0)\n"+ConsoleColors.RESET);
                ns = sc.nextInt();
                if(ns==1)
                {
                    NewUser();
                }
                else
                {
                    System.exit(0);
                }

            }
            if(flag==false)
            {
                createLogin();
            }
        
        
            
        //}
        // catch(IOException e){
        //     e.printStackTrace();
            
        //}
    
    }
    public void NewUser()throws IOException
    {
        Scanner sc1 = new Scanner(System.in);

        System.out.print("                                                                      Username: ");
        String username = sc1.nextLine();
        int n;
        System.out.print("                                                                      Password: ");
        String pswd = sc1.nextLine();

        String fileName = "Login.txt";

        try (var fw = new FileWriter(fileName, StandardCharsets.UTF_8, true)) 
        {
            fw.append(username+"\n");
            fw.append(pswd+"\n");

        }
        createLogin();

    }

    public static void main(String args[])throws IOException 
    {        
        Scanner sc = new Scanner(System.in);
        IA obj = new IA();
        System.out.println(ConsoleColors.CYAN+"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n" +ConsoleColors.RESET);
        System.out.println(ConsoleColors.CYAN+"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" +ConsoleColors.RESET);
        System.out.println(ConsoleColors.CYAN+"                                                                                                    "+ConsoleColors.RESET);
        System.out.println(ConsoleColors.YELLOW+"      🏥                                  🏥                          MEDICAL STORE MANAGEMENT                    🏥                                    🏥           " + ConsoleColors.RESET);
        System.out.println(ConsoleColors.CYAN+"                                                                                                    "+ConsoleColors.RESET);
        System.out.println(ConsoleColors.CYAN+"+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"+ConsoleColors.RESET);
        System.out.println(ConsoleColors.CYAN+"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"+ConsoleColors.RESET);
        obj.createLogin();


        int ch;
        OurShop customer = new OurShop();

        //myPswd mypass = new myPswd();
        //mypass.getInfo();

        while(true)
        {                            
            System.out.println(ConsoleColors.YELLOW+"-----------------------------------------------------------------------!! WELCOME TO HOME !!--------------------------------------------------------------\n"+ConsoleColors.RESET);
            System.out.println(ConsoleColors.CYAN+"                                                                         (1) Pharmacy                                                 "+ConsoleColors.RESET);
            System.out.println(ConsoleColors.CYAN+"                                                                         (2) Doctor Consultancy                                       "+ConsoleColors.RESET);
            System.out.println(ConsoleColors.CYAN+"                                                                         (3) Lab Test                                                 "+ConsoleColors.RESET);
            System.out.println(ConsoleColors.CYAN+"                                                                         (4) Blogs                                                    "+ConsoleColors.RESET);
            System.out.println(ConsoleColors.CYAN+"                                                                         (5) Bill                                                   \n "+ConsoleColors.RESET); 
            ch = sc.nextInt();

            
            //customer.making_list();
            switch(ch)
            {
                case(1):
                    customer.pharma();
                    break;
                case(2):
                    customer.doctor_consultancy();
                    break;
                case(3):
                    customer.lab_test();
                    break;
                case(4):
                    customer.Blogs();
                    break;
                case(5):
                    customer.Cart();
                    break;
                default:
                    System.out.println("wrong choice");
            }

        }
        
        
    }

   
 
}
