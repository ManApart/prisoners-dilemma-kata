# Prisoner's Dilemma Kata

## Background
This kata simulates and solves the prisoner's dilemma.

## Feature
As a prisoner<br>
I want to correctly guess when all prisoners have visited the warden<br>
So that I can become free

## The Riddle
A warden gathers his prisoners and presents a risky gambit. He has two levers in his office that can each be set to either up or down. After today the warden will call in 1 prisoner per day to his office and they must pull one of the two levelers. One prisoner will be elected guesser today and be told the total number of prisoners. At some point in the future, the guesser will have to guess that the warden has called all the prisoners into the office. If the guess is correct, all the prisoners go free. If the guess is wrong, the prisoners are committed for life.

## Requirements
The Warden:
- Must eventually call all prisoners into his office at least once
- Can call the same prisoner into his office more than once
- Can call prisoners in any order 

Each prisoner:
- Must pull one (and only one) lever when they visit the warden
- Cannot communicate to other prisoners or the guesser

The Guesser:
- Can only guess once
- Knows the total number of prisoners
- Is considered a prisoner and randomly meets with the warden
- Does not need to guess until they are sure, regardless of how many times they are called in


Deliverable:
Given x number of prisoners and a warden that pulls prisoners in at random, the guesser should properly guess when all prisoners have been called in the office at least once.