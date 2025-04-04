# Blackjack Card Game
*created by Aditya Kumar Bhardwaj*

## Overview
This project is a Java-based implementation of the classic card game Blackjack. The game follows standard Blackjack rules, where players compete against the dealer to achieve a hand value as close to 21 as possible without exceeding it. The program includes essential features such as card dealing, hit and stay options, and dealer logic.

## Key Features
- **Card Dealing:** game uses the Java Random library to shuffle and deal cards, each player starts with 2 cards and when the value exceeds 21 Ace (which can be either 11 or 1) is changed to have a value of 1 so that player and dealer can reach close to 21
- **Dealer Logic:** dealer starts with one hidden card and one exposed card. When the player clicks the stay button the dealer is dealt cards until his hand has a value of 17 or more at which point the algorithm compares the hands of the dealer and the player to determine the winner.
- **Hit/Stay Options:** Player is presented with 2 options/buttons Hit or Stay. The player cannot hit to get more and more cards, the hit button will become unavailbe once the player's hand exceeds 21. When stay button is clicked the dealer is dealt cards as mentioned above and then the game proceeds to determine the winner.

## Technologies Used

## Prerequisites

## Running the Application

explain OOP
parent - player
child - dealer
methods - to simply eg instead of player.setSum(player.getSum + card.getValue()) -> simplified to player.addSum(card.getValue())