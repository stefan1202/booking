import { RuralWebPage } from './app.po';

describe('rural-web App', () => {
  let page: RuralWebPage;

  beforeEach(() => {
    page = new RuralWebPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!!');
  });
});
