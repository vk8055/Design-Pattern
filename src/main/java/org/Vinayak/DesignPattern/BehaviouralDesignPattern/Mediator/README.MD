
Problem Statement :

Consider a chat application where multiple users can communicate with each other. In a naive implementation, each user would have to know about all other users to send messages to them, leading to a tightly coupled system. If a new user is added or removed, every user needs to be updated. This becomes unmanageable as the number of users grows.

How the Mediator Pattern Solves This Problem :

The Mediator Pattern introduces a mediator object that handles all communications between different users. Each user interacts with the mediator instead of interacting directly with other users. This centralizes the communication logic and makes the system more modular and easier to maintain.


In my example i have taken Online Auction System(which i am referring from Concept && Coding - by Shreyansh (Youtube)) for more simplification.


In example i have AuctionMediator interface which have functionality as an mediator for an auction.
Colleague is an interface where behaviour of Bidder is contracted.
Concrete implementation have functionality implementation.