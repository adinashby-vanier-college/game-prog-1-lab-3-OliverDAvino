// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class CrabWorld here.
 * @author (your name) @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Constructor for objects of class CrabWorld.
     */
    public CrabWorld()
    {
        super(560, 560, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab =  new Crab();
        addObject(crab, 163, 294);
        Worm worm =  new Worm();
        addObject(worm, 486, 218);
        Worm worm2 =  new Worm();
        addObject(worm2, 507, 313);
        Worm worm3 =  new Worm();
        addObject(worm3, 409, 120);
        Worm worm4 =  new Worm();
        addObject(worm4, 419, 380);
        Worm worm5 =  new Worm();
        addObject(worm5, 303, 502);
        Worm worm6 =  new Worm();
        addObject(worm6, 465, 488);
        Worm worm7 =  new Worm();
        addObject(worm7, 190, 48);
        Worm worm8 =  new Worm();
        addObject(worm8, 360, 36);
        Worm worm9 =  new Worm();
        addObject(worm9, 185, 168);
        Worm worm10 =  new Worm();
        addObject(worm10, 77, 496);
        Worm worm11 =  new Worm();
        addObject(worm11, 213, 436);
        Worm worm12 =  new Worm();
        addObject(worm12, 65, 122);
        ZombieLobster zombieLobster =  new ZombieLobster();
        addObject(zombieLobster, 529, 21);
        crab.setLocation(15, 547);
    }
}
