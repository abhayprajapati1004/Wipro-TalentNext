import java.util.Scanner;

 
class Video {
    private String videoName;
    private boolean checkout;
    private int rating;
    
     
    public Video(String name) {
        this.videoName = name;
        this.checkout = false;
        this.rating = 0;
    }
    
 
    public String getName() {
        return videoName;
    }
    
    public void doCheckout() {
        checkout = true;
    }
    
    public void doReturn() {
        checkout = false;
    }
    
    public void receiveRating(int rating) {
        this.rating = rating;
    }
    
    public int getRating() {
        return rating;
    }
    
    public boolean getCheckout() {
        return checkout;
    }
}

 
class VideoStore {
    private Video[] store;
    private int count;
    
    public VideoStore() {
        store = new Video[100]; 
        count = 0;
    }
    
    public void addVideo(String name) {
        if (count < store.length) {
            store[count] = new Video(name);
            count++;
            System.out.println("Video \"" + name + "\" added successfully.");
        } else {
            System.out.println("Store is full. Cannot add more videos.");
        }
    }
    
    public void doCheckout(String name) {
        for (int i = 0; i < count; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) {
                if (!store[i].getCheckout()) {
                    store[i].doCheckout();
                    System.out.println("Video \"" + name + "\" checked out successfully.");
                } else {
                    System.out.println("Video \"" + name + "\" is already checked out.");
                }
                return;
            }
        }
        System.out.println("Video \"" + name + "\" not found in inventory.");
    }
    
    public void doReturn(String name) {
        for (int i = 0; i < count; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) {
                if (store[i].getCheckout()) {
                    store[i].doReturn();
                    System.out.println("Video \"" + name + "\" returned successfully.");
                } else {
                    System.out.println("Video \"" + name + "\" is not checked out.");
                }
                return;
            }
        }
        System.out.println("Video \"" + name + "\" not found in inventory.");
    }
    
    public void receiveRating(String name, int rating) {
        for (int i = 0; i < count; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) {
                store[i].receiveRating(rating);
                System.out.println("Rating \"" + rating + "\" has been mapped to the Video \"" + name + "\".");
                return;
            }
        }
        System.out.println("Video \"" + name + "\" not found in inventory.");
    }
    
    public void listInventory() {
        if (count == 0) {
            System.out.println("No videos in inventory.");
            return;
        }
        
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-20s | %-20s | %-10s\n", "Video Name", "Checkout Status", "Rating");
        for (int i = 0; i < count; i++) {
            System.out.printf("%-20s | %-20s | %-10d\n", 
                store[i].getName(), 
                store[i].getCheckout(), 
                store[i].getRating());
        }
        System.out.println("---------------------------------------------------------------");
    }
}

 
public class VideoLaucher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VideoStore videoStore = new VideoStore();
        
        while (true) {
            System.out.println("\nMAIN MENU");
            System.out.println("==========");
            System.out.println("1.Add Videos:");
            System.out.println("2.Check Out Video :");
            System.out.println("3.Return Video :");
            System.out.println("4.Receive Rating :");
            System.out.println("5.List Inventory :");
            System.out.println("6.Exit :");
            System.out.print("Enter your choice (1..6): ");
            
            int choice = sc.nextInt();
            sc.nextLine();  
            
            switch (choice) {
                case 1:
                    System.out.print("\nEnter the name of the video you want to add: ");
                    String addName = sc.nextLine();
                    videoStore.addVideo(addName);
                    break;
                    
                case 2:
                    System.out.print("\nEnter the name of the video you want to Check Out: ");
                    String checkoutName = sc.nextLine();
                    videoStore.doCheckout(checkoutName);
                    break;
                    
                case 3:
                    System.out.print("\nEnter the name of the video you want to Return: ");
                    String returnName = sc.nextLine();
                    videoStore.doReturn(returnName);
                    break;
                    
                case 4:
                    System.out.print("\nEnter the name of the video you want to Rate: ");
                    String rateName = sc.nextLine();
                    System.out.print("Enter the rating for this video: ");
                    int rating = sc.nextInt();
                    videoStore.receiveRating(rateName, rating);
                    break;
                    
                case 5:
                    System.out.println();
                    videoStore.listInventory();
                    break;
                    
                case 6:
                    System.out.println("\nExiting the system. Thank you!");
                    sc.close();
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("\nInvalid choice. Please enter a number between 1 and 6.");
            }
        }
    }
}