import { AdaptiveCard } from "../../src/card-elements";

test('AdaptiveCard should be instantiated', () => {
    const adaptiveCard = new AdaptiveCard();
    expect(adaptiveCard).toEqual(expect.anything());
})
