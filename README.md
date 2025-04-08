# Blackjack Card Game
*created by Aditya Kumar Bhardwaj*


## Overview
This project is a Java-based implementation of the classic card game Blackjack. The game follows standard Blackjack rules, where players compete against the dealer to achieve a hand value as close to 21 as possible without exceeding it. 


### Blackjack logic
Blackjack uses the standard deck of cards containing the traditional 4 suits (Clubs, Diamonds, Hearts, and Spades) each with the convential 13 ranks (2 to 10, Jack, Queen, King, and Ace). However, in Blackjack the following cards all have a value of 10:
- Jack
- Queen
- King

The **Ace**, on the other hand, begins with a value of 11 and when the player's or dealer's hand exceeds 21, the Ace's value changes to 1 to allow both the dealer and the player to remain in the game for longer and compete in getting closer to 21.

When the game starts, the player is dealt with 2 cards in his/her hand whereas the dealer starts with one card in his/her hand and has another card that is hidden (face-down). The player then has the choice to either stay with their hand of cards or to draw more cards by pressing the `Hit` button.

Each round is played until the player decides to stay with their hand of cards, following which the dealer takes their turn drawing cards. In the end, the hidden card is revealed and a winner is determined by evaluating which player's hand is closer to 21. If either the player's or the dealer's hand exceeds 21, they will automatically lose. 


## Key Features
- **Object-Oriented-Design:** The Blackjack game follows 2 core principles of object-oriented programming: **Inheritance** and **Encapsulation**. The `Dealer` class extends the `Player` class, inheriting all of its methods which promotes code reuse and reduces duplication. In addition, attributes in all classes are marked as `private` and can only be accessed using their respective `public` getter and setter methods. This ensures encapsulation, encouraging controlled interaction between objects.

- **Card Dealing Algorithm:** To ensure fair play, the game uses a shuffled deck by implementing Java's `Random` class. Both the player and dealer start with 2 cards and upon subsequent turns when the player's or dealer's hand exceeds 21, the algorithm adjusts the value of any **Aces**, present in the hands, from 11 to 1.

- **Dealer Logic:** Dealer starts with one hidden card (face-down) and one visible card (face-up). Once the player clicks **Stay**, the dealer automatically draws additional cards until his/her hand reaches a value of 17 or higher. At this point, both the dealer's and player's hands are compared and the winner is determined as per standard Blackjack rules.

- **Interactive Graphic User Interface (GUI):** When the game is launched, an interactive window appears displaying both the dealer's and player's cards, along with `Hit` and `Stay` buttons for user interaction. The player cannot continue hitting indefinitely - if the player's hand value exceeds 21, the Hit button is disabled (grayed out), preventing further interaction.


## Technologies Used
- `java.util`: Utilized in this codebase for implementing `Lists` and for using the `Random` class to handle deck shuffling. 

- `java.awt`: **Abstract Window Toolkit (awt)** is a foundational Java library used for creating and managing essential GUI components such as colors, fonts, images, and layouts. 

- `java.awt.event`: Provides the `ActionListener` interface used for integrating frontend elements like the Hit and Stay buttons to the backend logic.  

- `javax.swing`: For creating frames, panels, and buttons in the GUI. Swing also provides custom methods like `paintComponent(Graphics g)` for drawing images of cards on the game panel.


## Prerequisites
- **Java 17** or higher
- A IDE of choice like **Visual Studio Code**


## Running the Application
1. Clone the repository
    ``` bash
    git clone https://github.com/Leman-24-horas/card-game-java.git     
    ```

2. Run the `compile.bat` file by pressing the play button in your IDE.

3. Run the `run.bat` file by pressing the play button in your IDE.

Alternatively, you can head over to the `src` folder and run the `App.java` file directly. 

## Future Improvements
- Implement a `Play Again` button and extend the backend logic to allow multiple arounds instead of requiring a relaunch of the game.

- Add a welcome screen with options such as `Start Game`, `Instructions`, and `Exit` to enhance user experience and create a more professional feel similar to actual videogames. 

- Add a `Role Selection` feature, where users can choose whether to play as the dealer or the player, together with a `Single Player/Multiplayer` mode. In Single Player mode the user plays their chosen role while the computer takes the opposite role. In Multiplayer mode, two users can play against each other by selecting opposite roles. 

## Demo
Please find the video for the Blackjack Demo
[here](https://drive.google.com/file/d/1vZ5mWxa6JAsn6Jdtk_tievPdCa2UzDXE/view?usp=sharing). 

If there are any issues with playing the video on the cloud, please download the video and play it locally on your computer. 

## Acknowledgements
This project was written and adapted independently, from a [tutorial](https://youtu.be/GMdgjaDdOjI) by Kenny Yip Coding on YouTube, with modifications and improvements made by using principles of Object-Oriented Programming. 