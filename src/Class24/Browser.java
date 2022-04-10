package Class24;

public class Browser {

    void openBrowser(){
        System.out.println("Opening the browser");
    }

    void loadPage(String websiteLink){
        System.out.println("Loading the website "+websiteLink);

    }
    void testThePage(){
        System.out.println("Testing the page");
    }
    void closeBrowser(){
        System.out.println("Closing the browser");
    }

}
//Shortcut to find and replace is CTRL+R on windsows

    class GoogleChrome extends Browser {

        public class Browser {

            void openBrowser() {
                System.out.println("Opening the browser");
            }

            void loadPage(String websiteLink) {
                System.out.println("Loading the website " + websiteLink);

            }

            void testThePage() {
                System.out.println("Testing the page");
            }

            void closeBrowser() {
                System.out.println("Closing the GoogleChrome browser");
            }
        }
    }

