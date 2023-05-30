class MobileAppTesting{
    async Explore(){
        await $("//android.widget.Button").touchAction('tap');
        await $('//android.view.View[@content-desc="Explore"]').touchAction('tap');
        await $('//android.widget.Button[5]/android.view.ViewGroup').touchAction('tap');
        await $("//*[@text='Computer science']").touchAction('tap');
        await $("//*[@text='Cryptography']").touchAction('tap');
    }
    async Bookmark(){
        await $('(//android.widget.Button[@content-desc="Add Bookmark"])[1]/android.widget.ImageView').touchAction('tap');
        await $('//*[@resource-id="android:id/button2"]').touchAction('tap');
        await $('android=new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text("Cryptography challenge 101"))');
        await $('(//android.widget.Button[@content-desc="Add Bookmark"])[2]/android.widget.ImageView').touchAction('tap');
        await $('android=new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text("Modular arithmetic"))');
        await $('//android.widget.Button[@content-desc="Add Bookmark"][1]').touchAction('tap');
    }
    async GoBacktoComputerScience(){
        driver.back();
        await $('//*[@text="Information theory"]').touchAction('tap');
        await $('android=new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text("Error correction"))');
        await $(`//android.widget.Button[@content-desc="Add Bookmark"][1]`).touchAction('tap');
    }
    async VerifyBookmark(){
        await $('//android.view.View[@content-desc="Bookmarks"]').touchAction('tap');
        await expect($('//android.widget.TextView[@text="Modern information theory"]')).toExist();
        await expect($('//android.widget.TextView[@text="Modular arithmetic"]')).toExist();
        await expect($('//android.widget.TextView[@text="Cryptography challenge 101"]')).toExist();
        await expect($('//android.widget.TextView[@text="Ancient cryptography"]')).toExist();
    }
    async ClearAllBookmarks(){
        await $('//android.widget.TextView[@text="Edit"]').touchAction('tap');
        await $('(//android.view.ViewGroup[@content-desc="Select bookmark"])[4]/android.widget.ImageView').touchAction('tap');
        await $('(//android.view.ViewGroup[@content-desc="Select bookmark"])[3]/android.widget.ImageView').touchAction('tap');
        await $('(//android.view.ViewGroup[@content-desc="Select bookmark"])[2]/android.widget.ImageView').touchAction('tap');
        await $('(//android.view.ViewGroup[@content-desc="Select bookmark"])[1]/android.widget.ImageView').touchAction('tap');
        await $('//android.widget.TextView[@text="Delete"]').touchAction('tap');
    }
    async LifeSkills(){
        const el = await $('~Search');
        await el.click();
        await el.click();
        await  $('//*[@resource-id="Life skills"]').touchAction('tap');
        await  $('//*[@resource-id="Financial Literacy"]').touchAction('tap');
        await $('//*[@text="Welcome to Financial Literacy"]').touchAction('tap');
        await $('//*[@text="Welcome to Financial Literacy"]').touchAction('tap');
        await driver.pause(15000);
        driver.back();
        driver.back();
        driver.back();
    } 
    async VerifyLastSeenTopic(){
        await $('//android.view.View[@content-desc="Home"]').click();
        await $('android=new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text("Recent lessons"))');
        await expect($('//*[@text="Intro to Financial Literacy"]')).toExist();
        await $('//android.widget.ImageView[@content-desc="Settings"]').click();
        await $('//*[@text="Download settings"]').click();
        await $('//*[@text="OFF"]').click();
        await $('//*[@text="ON"]').click();
        driver.back();
        await $('//*[@text="App icon"]').click();
        await $('//*[@text="Rainbow"]').click();
        await $('//*[@resource-id="android:id/button1"]').click();
        await driver.startActivity("org.khanacademy.android","icon.rainbow");
        await $('//android.widget.ImageView[@content-desc="Settings"]').click();
        await $('//*[@text="App icon"]').click();
        await $('//*[@text="Default"]').click();
        await $('//*[@resource-id="android:id/button1"]').click();
        await driver.startActivity("org.khanacademy.android","org.khanacademy.android.ui.library.MainActivity");
    }
    async Artshumanities(){
        await $('//android.view.View[@content-desc="Explore"]').touchAction('tap');
        await $("//*[@text='Arts and humanities']").touchAction('tap');
        await $("//*[@text='Big History Project']").touchAction('tap');
        await $('android=new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text("Early Humans"))').click();
        await $("//*[@text='READ: Lucy and the Leakeys']").touchAction('tap');
        await $('android=new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1,5)');
        await driver.back();
        await $('android=new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text("WATCH: Why Human Evolution Matters"))').click();
        await driver.pause(15000);
        await driver.back();
        await driver.back();
        await $('android=new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text("The Future"))').click();
        await $('android=new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text("Quiz: Biosphere"))').click();
        await $(`//*[@text="Let's go"]`).click();
        await driver.startActivity("org.khanacademy.android","org.khanacademy.android.ui.library.MainActivity"); 
    }
    async CloseApp(){
        await driver.pause(5000);
        await driver.pressKeyCode(187);
        await driver.touchAction([{ action: 'press', x: 370, y: 1250 },{ action: 'moveTo', x: 370, y: 200 },'release']);
    }
}
module.exports = new MobileAppTesting();

