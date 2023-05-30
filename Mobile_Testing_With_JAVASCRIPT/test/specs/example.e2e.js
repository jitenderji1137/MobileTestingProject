const MobileAppTesting = require("../pageobjects/page");
describe('Mobile App Testing', () => {
    it('Explore',async() => {
        await MobileAppTesting.Explore();
    });
    it('Bookmark', async() => {
        await MobileAppTesting.Bookmark();
    });
    it('Go Back to Computer Science', async() => {
        await MobileAppTesting.GoBacktoComputerScience();
    });
    it('Verify Bookmark', async() => {
        await MobileAppTesting.VerifyBookmark();
    });
    it('Clear All Bookmarks', async() => {
        await MobileAppTesting.ClearAllBookmarks();
    });
    it('Go to Explore and Tap on "Life Skills"', async() => {
        await MobileAppTesting.LifeSkills();
    });
    it('Verify Last Seen Topic', async() => {
        await MobileAppTesting.VerifyLastSeenTopic();
    });
    it('Arts_humanities', async() => {
        await MobileAppTesting.Artshumanities();
    });
    it('Close App', async() => {
        await MobileAppTesting.CloseApp();
    });
});