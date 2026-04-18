
class BookingPage{

    constructor(page){
        this.page = page;
        this.firstFlight = this.page.locator("tbody tr td input").nth(1);
    }

    async chooseFligt(){
        await this.firstFlight.click();
    }

}

module.exports = {BookingPage};