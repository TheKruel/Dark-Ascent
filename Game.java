import java.util.Scanner;
import java.awt.*;
import javax.swing.*;
import java.util.*;
/*
 * 
 * @author TheKruel
 * 
 */

public class Game {

    public static int Hp = 1;
    public static boolean hasEscaped = false;
    public static boolean knife = false;
    public static boolean prisonKeys = false;
    public static boolean gun = false;
    public static boolean gameChoice = false;
    //Container con;
    //JFrame gameWindow;
    //JPanel namePanel;
    //JLabel gameTitle;
    
    /*
    public void Window() {
        JFrame gameWindow = new JFrame();
        gameWindow.setSize(800, 600);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.getContentPane().setBackground(Color.black);
        gameWindow.setLayout(null);
        gameWindow.setVisible(true);
        con = gameWindow.getContentPane();
        JPanel namePanel = new JPanel();
        namePanel.setBounds(100,100,600,150);
        namePanel.setBackground(Color.gray);
        Font gameTitleFont = new Font("Times New Roman", Font.PLAIN, 28);
        JLabel gameTitle = new JLabel("DARK ASCENT");
        gameTitle.setFont(gameTitleFont);
        gameTitle.setBackground(Color.red);
        namePanel.add(gameTitle);
        con.add(namePanel);
    }
    */
    
    public static void main(String[] args){
        // Initializes the game.
            Intro();
    }

    public static void Intro(){
        //String s1 = str.substring(0, 1).toUpperCase();
        //String s2 = str.substring(1);
        //String res = str.substring(0, 1).toUpperCase() + str.substring(1);

        // Introductory game title.
        System.out.println("\n");
        System.out.println("A console written text-based horror adventure, created by Brian Allison(TheKruel).\nThere are many ways one can go about escaping the darkness..\nExperiment with your environment. If you think there are multiple ways to do something, then chances are, other ways may just exist!\nBe careful! You aren't alone in the dark places of the world. Twisted monstrosities and cruel beings seek to rip you apart. Use stealth to evade danger altogether or find a weapon to defend yourself.\nAnd.. Remember.\nIn a land of madness and impossibility, the only thing that scares someone - is the thing that makes sense.\n");
        System.out.println("HOW TO PLAY: When requested by a prompt to choose a specific action or direction, type the number and press ENTER.\n");
        System.out.println("------------");
        System.out.println("DARK ASCENT");
        System.out.println("------------\n");

        System.out.println("You wake up in a dark prison cell, with no recollection of how you got there.\nIn fact, you can hardly remember anything other than your name at the moment.\nMiddleton. It is.\n\nThe only shred of light that illuminates your surroundings is a torch sconce that you can see through\nthe iron barred window of the massive wooden door to your cell.");
        System.out.println("\n");
        System.out.println("A retched aroma of iron fills the room, and upon closer inspection with the straw covered stone floor,\nyou notice streaks of blood and evidence of a forced struggle.\nYou reach back and feel your head.\nBlood.\nYour only thought is that you must get out and seek help.\n");
        System.out.println("After grabbing a sharp spike shaped rock, you move it around in the lock for a few seconds and hear a faint click to the door.\nPulling it open, you are greeting to a long bloodstained hallway that extends to the left and to the right.\nIt looks almost as if the blood was intentionally splashed upon the walls.\nPuddles of the foul crimson fill in missing stones in the floor, internal organs and entrails from various creatures are left messily about.\nThe smell is even more putrid now, knowing what you have seen and realizing that you were likely to become like those who's entrails decorate the ground.\n");
        room0();
    }
    // Middleton's Cell
    public static void room0(){
        if(gameChoice = true){
            gameChoice = false;
        }
        System.out.println("\n-------------------------------------------------------------");
        // Immediately sets the choice made by the player to false and changes it when answered properly through the scanner.
        boolean choiceMade = false;

        // While loop to continue attempting to get a proper input from the user and ends upon getting the specific input.
        while(choiceMade == false){
            System.out.println("\nFrom your cell, which direction will you go?\n1. Left\n2. Right");
            String chosen = "";
            Scanner choice = new Scanner(System.in);
            System.out.println("");
            chosen = choice.nextLine();
                if(chosen.equals("1")){
                    choiceMade = true;
                    if(knife == true){
                        String chosen0 = "";
                        Scanner choice0 = new Scanner(System.in);
                        System.out.println("\nYou were just here, are you sure you want to go back to the kitchen?\n1. Yes\n2. No\n");
                        chosen0 = choice0.nextLine();
                        if(chosen0.equals("1")){
                            System.out.println("\nYou go back to the kitchen.\n");
                            Room1();
                            choiceMade = true;
                        }
                        else if(chosen0.equals("2")){
                            room0();
                            choiceMade = true;
                        }
                        else{
                            System.out.println("\nThat is not a valid choice.\n");
                        }
                    }
                    Room1();
                }
                else if(chosen.equals("2")) {
                    System.out.println("\nAs you walk down the hall to the right of your cell, you take notice of other cells like yours. Dull, empty and unworthy of your time.\nAt the end of the hall stands a door much the same as the one to your cell.\nIt is locked.");
                    if(knife == true){
                        System.out.println("\nYou place the tip of the knife into the lock and twist it a couple of times.\nAfter realizing that this isn't going to work, you look around for something to move the pins of the lock as the knife continues to twist.\nLuckily, you find a piece of metal on the ground and utilize it to open the door.\n\nThe room that you now pere into is dimly lit by a couple of candles and completely covered by a large bloodstained rug, but you notice fine paintings upon wooden walls and shelves holding bottles of an unknown liquid.\nThe details of the paintings are too tough to make out but there doesn't appear to be anyone in the room at the moment.");
                        Room2();
                        choiceMade = true;
                    }
                    else{
                        System.out.println("\n\nThe lock to this door is much stronger and far more complex than the one to your cell.\nPerhaps there is something you can use to open it with...\n");
                        room0();
                        choiceMade = true;
                    }
            }
                else{
                    System.out.println("\nThat is not a valid direction.\n");
            }
        }
    }
    //The Kitchen
    public static void Room1(){
        System.out.println("\n-------------------------------------------------------------");
        boolean choiceMade1 = false;
        boolean choiceMade01 = false;
        System.out.println("\nUpon choosing to go left down the hallway you notice the corpse of a dead orc.\nMultiple deep cuts and slashes are present all over his body, leading you to believe that he eventually just passed out from blood loss.\nThe wounds look like those that a lion or a bear might be capable of producing.\nYou are greeted by the familiar smells of meat, spices and smoke through an ajar door at the end of the hallway.\nThe room appears to be well lit from torches and a large oven, which glows an unholy red.\nAnimal heads and pig carcasses hang from hooks, chained to the ceiling.\nThis must be the kitchen.\nJust as you are about to step in, you hear a deep grunt and the sound of a cleaver smack upon a cutting board.\n");
        System.out.println("What will you do?\n\n1. Sneak in\n2. Walk in\n3. Fight\n");

        while(choiceMade1 == false){
            String command1 = "";
            Scanner sc1 = new Scanner(System.in);
            command1 = sc1.nextLine();
                if(command1.equals("1")){
                    String command01 = "";
                    Scanner sc01 = new Scanner(System.in);
                    System.out.println("\nCrouching down, you move quietly through the ajar door and under a large bloodstained counter top. A disfigured giant dressed in a bloody apron is much too busy to have noticed you.\nWhat would you like to do now?\n\n1. Go Back\n2. Search\n");
                    command01 = sc01.nextLine();
                    if(command01.equals("2")){
                        System.out.println("\nWhile sneaking around the kitchen, you are almost spotted a few times - but in your precision, you manage to grab a normal sized knife from a drawer\nand sneak back out into the hallway.\n(New Weapon!)");
                        knife = true;
                        room0();
                        choiceMade1 = true;
                    }
                    else if(command01.equals("1")){
                        System.out.println("\nYou decide that what you are doing is much too risky, and move back to the hallway.");
                        room0();
                    }
                    else{
                        System.out.println("\nThat is not a valid choice.\n");
                    }
                }
                else if(command1.equals("2")){
                    System.out.println("\nAs you walk into the room, you are noticed by a disfigured giant wearing a bloody apron.\nYou back up as he marches toward you and feel the world go black as he plunges a massive cleaver into your skull, but that isn't it.\nFor the few seconds that you are alive, you are brought to the cutting board and witness your arms and legs be cut from your body.\n");
                    Hp = 0;
                    Gameover();
                    choiceMade1 = true;
                    returnStart();
                }
                else if(command1.equals("3")){
                    if(knife == true){
                        System.out.println("\nYou run into the kitchen, knife drawn, and successfully stab the giant in the leg.\nHe recoils in pain and lets out a grunt.\nHowever, such a stab was not enough to kill him.\nYou try to run but grabs you by the neck and slams you down onto the cutting board. The next thing you hear is the slam of steel on wood and as you look down toward your legs,\nyou see the large cleaver separating your torso from your lower half.\n");
                        Hp = 0;
                        Gameover();
                        choiceMade1 = true;
                        returnStart();
                    }
                    else {
                        System.out.println("\nYou fearlessly burst into the kitchen with your fists up and a giant dressed in a bloody apron looks down at you.\nWithout much effort the giant grabs you, breaks your neck, and rips your head from your body.\n");
                        Hp = 0;
                        Gameover();
                        choiceMade1 = true;
                        returnStart();
                    }
                }
                else{
                    System.out.println("\nThat is not a valid choice.\n");
                    System.out.println("What will you do?\n1. Sneak in\n2. Walk in\n3. Fight\n");
            }
        }
    }
    // The Office
    public static void Room2(){
        int checked = 0;
        String checkin2 = "";
        System.out.println("\n-------------------------------------------------------------");
        boolean choiceMade2 = false;

        while(checked == 0){
            Scanner check2 = new Scanner(System.in);
            System.out.println("\nThis is considered a safe location. Would you like to check your inventory?\n\n1. Yes\n2. No\n");
            checkin2 = check2.nextLine();
            if(checkin2.equals("1")){
                inventoryCheck();
                checked = 1;
            }
            else if(checkin2.equals("2")){
                System.out.println("\nVery well.\n");
                checked = 1;
            }
        }

        while(choiceMade2 == false){
                System.out.println("\nThere is a door on the otherside of the room, and another on the left most wall of it.\nA desk sits before you.\nWhat do you do?\n1. Check desk\n2. Try left door\n3. Try front door\n4. Inspect room\n");
                Scanner sc2 = new Scanner(System.in);
                String command02 = "";
                command02 = sc2.nextLine();
                if(command02.equals("1")){
                    if(prisonKeys == false){
                        System.out.println("\nYou start to look over the surface of the desk and find nothing more than a couple of ledgers with various dates on them, a couple of feather quills with an ink well.\nA mess of papers decorates the left side of the desk.\nOnce you start trying the drawers, you find three of them to be locked or jammed shut but one of them opens up revealing a set of keys.\n(Prison Keys acquired!)\n");
                        prisonKeys = true;
                    }
                    else if(prisonKeys == true){
                        System.out.println("You find nothing else of use on the desk.");
                    }
                }
                else if(command02.equals("2")){
                    System.out.println("\nWalking to the left of the room, you place your ear to the door but hear nothing.\nyou try the handle to the door and it pulls open with ease.\n");
                    Room3();
                    choiceMade2 = true;
                }
                else if(command02.equals("3")){
                    if(prisonKeys == true){
                        System.out.println("You attempt different keys from the key ring and upon your third try, you find the particular key that fits the lock.\nYou feel a slight click in the door and the lock mechanism releases.\n");
                        Room5();
                        choiceMade2 = true;
                    }
                    else if(knife == true && prisonKeys != true){
                        System.out.println("Upon walking up to the door, you find yet another lock, but it seems no tougher than the one previous.\nSo with your knife and the piece of scrap metal, you manage to get the door open.\nHowever, you completely ruin the knife in the process.\n(Knife Destroyed.)\n");
                        knife = false;
                        Room5();
                        choiceMade2 = true;
                    }
                    else {
                        System.out.println("Upon walking up to the door, you notice the same lock that you had seen on the door leading to the cell block. There must be something that you can use to open it with...\n");
                    }
                }
                else if(command02.equals("4")){
                        System.out.println("\nOther than the bottles which you can now see are filled with ink, exceptionally well painted portraits of various important individuals from Kaskroden hang from the rough wood walls.\nOne appears to be of 'Dranosh Bloodscowl', the overlord of the Razorfang Clan, as he holds up the carcass of a slain lion.\nThe next depicts 'Gar Khaz'Grim', the exiled overlord of the Wildwalker Clan, conjuring the elements of fire and water in each hand respectively.\nThe last painting is much larger than the rest, and sees the orcish clans as well as the giants bowing before the god, Artariay...\n");
                }
                else{
                    System.out.println("What will you do?\n1. Check desk\n2. Try left door\n3. Try front door\n4. Inspect room\n");
                }
            }
        }
    // The Training Room
    public static void Room3(){
        boolean choiceMade3 = false;
        boolean choiceMade03 = false;
        System.out.println("\n-------------------------------------------------------------\n");
        System.out.println("\nUpon opening the door, the only thing you can see is the light from a small candle at the far end of the room.\nIt appears to be slightly illuminating a door.\nOtherwise, you can see nothing else.\nFrom the darkness you hear footstep quickly closing in on you.\nWhat will you do?\n1. Close the door\n2. Proceed in, then close the door (There is no going back on this!)\n");

        while(choiceMade3 == false){
            String command03 = "";
            Scanner sc3 = new Scanner(System.in);
            command03 = sc3.nextLine();
            if(command03.equals("1")){
                System.out.println("You close the door quickly and hear the footsteps begin to slow down as a gust of foul wind sweeps through your feet. You place your ear against the door again.\n\nUnknown Voice: You'll be back..\n");
                Room2();
                choiceMade3 = true;
            }
            if(command03.equals("2") && choiceMade03 == false){
                System.out.println("\nYou enter the room and slam the door shut. The footsteps haven't slowed.\nYou crouch down and move off to the left as quietly as you can, and once the footsteps have made it where you once were, they stop.\n\nUnknown Voice: Let the game begin..\n");
                while(choiceMade03 == false){
                    String command3 = "";
                    Scanner sc03 = new Scanner(System.in);
                    System.out.println("\nWhat will you do now?\n1. Run toward the candle\n2. Sneak toward the candle\n3. Fight\n4. 'Who are you.'\n");
                    command3 = sc03.nextLine();
                    if(command3.equals("1")){
                        System.out.println("You get up and begin to run toward the candle.\n\nUnknown Voice: Shouldn't have done that..\n\nAlong the way there, you trip on what feels like a leg, although not connected to a body.\nYou scramble to your feet, but just as you get up, the creature has managed to grab onto you with its claws.\nThe creature throws you down to the stone floor and begins tearing away at your flesh, ripping your left arm from your body.\nYou look straight up and see the blade of an axe come down at your face.\n");
                        Hp = 0;
                        Gameover();
                        choiceMade03 = true;
                        choiceMade3 = true;
                        returnStart();
                    }
                    else if(command3.equals("2")){
                        System.out.println("\nNot wanting to give away your position to the creature in the room, you creep to the candle, climbing over bodies as you go.\nOnce you have reached the door in front of the candle, you pull on the handle to find that it is locked.\n");
                        if(prisonKeys == true){
                            System.out.println("\nYou put the knife down quietly and check the keyring in your other hand.\nAfter a couple of attempts one of the keys fits the lock and you hear a click.\n\nUnknown Voice: I can hear your breath..\n\nYou pull the door open and walk into the room.\n");
                            Room4();
                            choiceMade03 = true;
                            choiceMade3 = true;
                        }
                    }
                    else if(command3.equals("3")){
                        if(knife == true && prisonKeys == true){
                            System.out.println("\nYou rear up and ready your blade.\n\nUnknown Voice: ...\n\nAs you creep toward where you think the creature may be,\nyour foot collides with a metallic vase and sends it sputtering across the floor.\n\nUnknown Voice: There you are!\n\nYou feel a massive gust of wind push past you as the footsteps grow louder.\nYou hold the knife out before you and hope that the creature in the room runs into it, and fortunately, you hear a loud shriek and feel a splash of liquid against your hand.\nNot waiting around to find out if you had truely killed the creature, you bolt to the door and attempt the handle.\nThough it is locked.\nYou frantically flip through the keyring and manage to get the door open.\n\nUnknown Voice: PFFT! This is not over!\n\n");
                            Room4();
                            choiceMade03 = true;
                            choiceMade3 = true;
                        }
                        else if(knife == true && prisonKeys != false){
                            System.out.println("You rear up and ready your blade.\n\nUnknown Voice: Hm?\n\nYou sneak over to where you think the creature may be and attempt to thrust your blade into the darkness.\n\nUnknown Voice: AGH!\n\nYou feel a quick splash of liquid on your hand, but as you attempt to pull the knife out, you drop it.\nNot wanting to find out if the creature will die from its wound, you rush to the door to find that it is locked.\nYou pound on it and scream, but unfortunately, the footsteps behind you grow louder and the creature jumps on you.\nIt begins tearing you apart and hacking at you with an axe..\nYour screams can be heard through the entirety of the dungeon..\n");
                            Hp = 0;
                            Gameover();
                            choiceMade03 = true;
                            choiceMade3 = true;
                            returnStart();
                        }
                        else if(knife != true && prisonKeys == true){
                            System.out.println("\nYou raise your fists and attempt to swing at where you think the creature is and manage to connect with what feels like a slimy face.\n\nUnknown Voice: AGH!\n\nThe creature jolted back in pain Not wasting any time you run to the door, and find it to be locked.\nYou scramble through the keyring and finally manage to get the door open, before the creature has caught you.\n");
                            Room4();
                            choiceMade03 = true;
                            choiceMade3 = true;
                        }
                        else{
                            System.out.println("\nRaising your fists, you run toward where you thought the creature was and swing wildly, connecting with nothing.\nYou feel something heavy hit you in the back and a jolt of pain shoots through your body.\nYou collapse to your knees, unable to feel them, and grasp at the object sticking out of your back.\nIt was an axe.\nBefore you can remove it, metal claws close around your throat and rip it out.\n");
                            Hp = 0;
                            Gameover();
                            choiceMade03 = true;
                            choiceMade3 = true;
                            returnStart();
                        }

                    }
                    else if(command3.equals("4")){
                        System.out.println("\n\nMiddleton: Who are you.\n\n");
                        System.out.println("You hear the creature twitch and turn, footsteps move in your direction.\n\nUnknown Voice: Yes. Keep talking..\n\n");
                    }
                    else{
                        System.out.println("That is not a valid action.\n");
                    }
                }
            }
        }
    }
    // The Storage Room
    public static void Room4(){
        int checked4 = 0;
        String checkin4 = "";
        boolean choiceMade4 = false;
        System.out.println("\n-------------------------------------------------------------\n");
        System.out.println("\nAs you close the door, you notice this room to be quite dark as well. Though it is not nearly as big as the room previous.\nVarious tools, boxes and bags sit upon wooden shelves before you and barrels line the room.\nEverything is mostly within arms reach, except for a couple of ornate boxes behind a barrel.\nThere does not seem to be any other way out of this room than the way you came, however.\n");
        
        while(checked4 == 0){
            Scanner check4 = new Scanner(System.in);
            System.out.println("\nThis is considered a safe location. Would you like to check your inventory?\n\n1. Yes\n2. No\n");
            checkin4 = check4.nextLine();
            if(checkin4.equals("1")){
                inventoryCheck();
                checked4 = 1;
            }
            else if(checkin4.equals("2")){
                System.out.println("\nVery well.\n");
                checked4 = 1;
            }
        }

        while(choiceMade4 == false){
            String command4 = "";
            Scanner sc04 = new Scanner(System.in);
            System.out.println("\nWhat will you do?\n1. Inspect the room.\n2. Inspect the ornate boxes\n3. Attempt to leave.\n");
            command4 = sc04.nextLine();

            if(command4.equals("1")){
                System.out.println("\nVarious boxes of spices and old rotten produce lay on the ground before you.\nRotten, damp shelves hold the remenants of candles long burned away and a lantern appears to be without oil.\nThe bags hold only scrolls with various languages on them and much of the parchment is in poor condition.\nYou find nothing of use, other than what the ornate boxes contain.\n");
            }
            else if(command4.equals("2") && knife == false){
                System.out.println("\nYou grab the first ornate box and open it with ease, inside is the horn of an ox which contains black powder.\nTo you it seems that there might be enough to start a small fire, but is otherwise useless.\nThe other ornate box is jammed shut however.\nPerhaps something thin can fit in between the lid and case...\n");
            }
            else if(command4.equals("2") && knife == true){
                String command04 = "";
                Scanner sc4 = new Scanner(System.in);
                System.out.println("\nYou grab the first ornate box and lift open the lid, inside is a horn full of black powder. Perhaps this could be useful.\nThe second box however is jammed shut.\n\nWould you like to use the knife to open it\n1. Yes\n2. No");
                command04 = sc4.nextLine();
                if(command04.equals("1")){
                    System.out.println("\nWith your knife, you manage to pry the lid open but completely destroy the tip of the blade in the process.\nHowever, your face lights up once you notice that this case contains a small single-shot flintlock pistol.\nAnd it is preloaded.\n(Knife Destroyed)\n");
                    knife = false;
                    gun = true;
                }
                else if(command04.equals("2")){
                    System.out.println("\nYou decide that the contents within the box cannot be worth the destruction of your only weapon, and you set it the box back where you found it.\n");
                }
            }
            else if(command4.equals("3") && knife != true && gun == true){
                boolean choiceMade04 = false;
                while(choiceMade04 == false){
                    String command004 = "";
                    Scanner sc004 = new Scanner(System.in);
                    System.out.println("\nYou grab the handle to the door and open it carefully.\nThe creature can be heard shuffling about on the other end of the room.\nWhat will you do?\n\n1. Fight\n2. Sneak by\n3. Run\n");
                    command004 = sc004.nextLine();
                        if(command004.equals("1")){
                            System.out.println("\nYou attempt to fire your pistol at the creature but you hear the obvious crunch of wood.\nWithout anymore ammunition, you frantically scramble for the door behind you and try to pull it open.\n\nUnknown Voice: Nice try..\n\nYou feel a stinging sensation in your back as the creature has now caught up to you.\nBoney fingers protrude through your torso, and as you scream, the creature rips deeper into your flesh.\n");
                            Hp = 0;
                            Gameover();
                            choiceMade04 = true;
                            choiceMade4 = true;
                            returnStart();
                        }
                        else if(command004.equals("2")){
                            System.out.println("\nNot wanting to meet a gruesome end (or expend any of your resources), you decide to take it slow and creep across the room.\nYou manage to make it to the wall, and begin feeling around for the door.\n\nUnknown Voice: Clever. I know you are in here..\n\nYou find the frame of the door and force it open.\n");
                            Room2();
                            choiceMade04 = true;
                            choiceMade4 = true;
                        }
                        else if(command004.equals("3")){
                            System.out.println("\nYou book it straight for the door at the end of the room, though as you do so.\nA quick object strikes you in the gut.\n\nUnknown Voice: Foolish.\n\nYou look down and notice the blade of an axe buried deep in your abdomen.\nAnd with a single motion the creature yanks it out - causing your entrails to spill out over the floor.\n");
                            Hp = 0;
                            Gameover();
                            choiceMade04 = true;
                            choiceMade4 = true;
                            returnStart();
                        }
                        else{
                            System.out.println("\nThat is not a valid option.\n");
                        }
                    }
            }
            else if(command4.equals("3") && knife == true && gun == false){
                System.out.println("\nYou run straight for the door at the other end of the room, tripping on a couple of corpses along the way.\n\nUnknown Voice: No. NO!\n\nFootsteps close in on you, and with one quick jab of your knife you hear a scream.\nWhoever was chasing you has halted their advance, leaving you enough time to feel around for the door and pull iit open.\n");
                Room2();
                choiceMade4 = true;
            }
            else if(command4.equals("3") && knife == false && gun == false){
                System.out.println("\nYou decide to exit the room, determining there to be nothing of use to you\nNor any way to get the ornate boxes open.\n");
                Hp = 0;
                Gameover();
                choiceMade4 = true;
                returnStart();
            }
            else {
                System.out.println("\nThat is not a valid option.\n");
            }
        }
    }
    // The Laboratory
    public static void Room5(){
        boolean choiceMade5 = false;
        System.out.println("\n-------------------------------------------------------------\n");
        System.out.println("\nEntering into this room, you are greeted by a small but bright room lit by unholy green torches in each corner.\nVarious desks are cluttered with books and scrolls, and drawers hang open overflowing with pieces of scrawled parchment.\nTables stand adjacent to eachother, leaving only enough room for one person to move between them,\nand glass test tubes, beakers, vials, graduated cylinders and bottles hang from apparatuses.\nPowerful smells of smoke, sulfur, calamine and aqua regia permeate around the room.\nFrom what you can see, there is only one other door in this room and is located on the left most wall.\n");

        while(choiceMade5 == false){
            String command5 = "";
            Scanner sc5 = new Scanner(System.in);
            System.out.println("\nWhat will you do?\n\n1. Attempt the door.\n2. Check over the desks\n3. Inspect the laboratory equipment\n4. Go back to the office\n");
            command5 = sc5.nextLine();
            if(command5.equals("1") && prisonKeys == true){
                System.out.println("\nWalking up to this door, you unsurprisingly find it to be locked.\nThough with the ring of keys, you manage to find the one that fits the lock after a few attempts.\n");
                //Room6();
                choiceMade5 = true;
            }
            else if(command5.equals("1") && prisonKeys != true){
                System.out.println("\nYou are a little less than surprised when you walk up to this door and find it locked.\nHowever with nothing to unlock it you step back.\nPerhaps there is something you can use to unlock this door...\n");
            }
            else if(command5.equals("2")){
                System.out.println("\nYou ");
            }
            else if(command5.equals("3")){

            }
            else if(command5.equals("4")){

            }
            else{
                System.out.println("\nThat is not a valid option.\n");
            }
        }
    }

    public static void Knife(){
        if (knife == true){
            System.out.println("You have a knife.");
        }
    }
    public static void returnStart(){
        String startOverCommand = "";
        Scanner startOver = new Scanner(System.in);
        System.out.println("\nWould you like to try again?\n\n1. Yes\n2. No\n");
        startOverCommand = startOver.nextLine();
        while(gameChoice == false){
            if(startOverCommand.equals("1")){
                room0();
                gameChoice = true;
            }
            else if(startOverCommand.equals("2")){
                System.exit(0);
                gameChoice = true;
            }
            else{
             System.out.println("\nThat is not a valid input.\n");
            }
        }
    }
    
    public static void inventoryCheck(){
        System.out.println("\nIn your possession, you own:\n");
        if(knife == true){
            System.out.println("Kitchen Knife\n");
        }
        else if(knife != true){
            System.out.println("");
        }
        if(prisonKeys == true){
            System.out.println("Prison Keys\n");
        }
        else if(prisonKeys != true){
            System.out.println("");
        }
        if(gun == true){
            System.out.println("Flintlock Pistol\n");
        }
        else if(gun != true){
            System.out.println("");
        }
        else{
            System.out.println("\nYour pockets are empty!\n");
        }
    }

    // Identies if the user has entered a certain room and completed a certain puzzle to win the game. 
    public static void GameWin(){
        System.out.println("You have escaped from the labyrinth.\n");
        System.out.println("\nThank you for playing my game!\n-Brian Allison\n");
        hasEscaped = true;
    }

    // Identifies if the variable "Hp" is lower than 1, and ends the program.
    public static void Gameover(){
        if (Hp < 1){
            System.out.println("\nYou have perished to the darkness...\n");
        }
    }
}
    /* 
    int room2 = 2;
    int room3 = 3;
    int room4 = 4;
    int room5 = 5;
    int room6 = 6;
    int room7 = 7;
    int room8 = 8;
    */