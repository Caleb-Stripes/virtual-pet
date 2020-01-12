Bandersnatch is a fearsome tiger like beast introduced to the world by the author Lewis Caroll in the poem "Jabberwocky"
In this virtual pet application you will get your very own bandersnatch, name it, play with it, train it and send it hunting.
After naming it you will loop through option menus, to check how it is doing you can choose to see a synopsis on the main menu. When your bandersnatch gets tired it will sleep, and when it gets hungry you must send it on a hunt to find food for itself.
The only way your bandersnatch can die is by starvation, so make sure to send it hunting regularly, but keep in mind the prey options are listed in order of difficulty. So it is wise to train your bandersnatch before sending it off to hunt Rodents of Unusual Size. Only the most distinguished BanderMasters can train a bandersnatch to take down a dragon...

Now for a break down on methods.

The status variable for bandersnatch represents it being Awake, Asleep or Dead.
getSleep and getWake track the fatigue variable to determine when it is Awake vs Asleep, and do so through the use of two do while loops within the main for loop.
Admittedly I do not fully understand how Thread.sleep works, however in testing it created the desired outcome.

getTick causes the hunger variable to go up constantly, causing you to leave the game loop if hunger gets too high, this will change status to Dead.

The mainMenu and menuFix allow you to interact with the fred object (the bandersnatch) created to be the pet in virtual pet application.

Get play will spit out a random response reguarding some sort of cat-like play activity.

getTrain will allow you to raise the level variable which assists in succeeding in the getHunt method. However, getTrain also prevents raising the level variable if the fatigue variable is 10 or more.

The choosePrey variable, preyFix method and getHunt method combine to create what is likely the most complex function in this code. It uses the users input prey choice and pits the difficulty of that selection against the bandersnatches level variable and a random integer between 2 and 20 to determine the success of the hunt. a successful hunt will also reduce the hunger variable based upon the choosePrey.

getSynopsis outputs to the user a description of how the bandersnatch is doing.

From the main menu, selecting option 5 will terminate the program. If there is any input that is unrecognizible the program will output clarifying instructions.