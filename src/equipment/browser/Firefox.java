package equipment.browser;

public class Firefox implements Browser {
    @Override
    public void page() {
        System.out.println("Open page");
    }

    @Override
    public void addNewTab() {
        System.out.println("Add new tab");
    }

    @Override
    public void updatePage() {
        System.out.println("Updating page");
    }
}
