class  {
    constructor(page) {
        this.page = page;

        this.departureDropdown = page.locator('select[name="fromPort"]');
        this.destinationDropdown = page.locator('select[name="toPort"]');
 
        this.findFlightsButton = page.locator('input[type="submit"]');
    }

 
    async selectDeparture(city) {
        await this.departureDropdown.selectOption({ label: city });
    }
 
    async selectDestination(city) {
        await this.destinationDropdown.selectOption({ label: city });
    }
 
    async submitSearch() {
        await this.findFlightsButton.click();
    }
}
 
export default BlazeDemoHome;