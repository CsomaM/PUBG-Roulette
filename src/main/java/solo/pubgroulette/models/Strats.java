package solo.pubgroulette.models;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Strats {

    List<String> strats = Arrays.asList(
            "Lucky Duck: No special rules",
            "Choose Wisely: You can only loot one house (can loot bodies)",
            "Respect the Dead: No looting bodies",
            "Red or Dead: You can only loot red houses/structures",
            "Grounded: You can only loot the bottom story/floor of any building/house/structure",
            "Fuckboy: You can only loot fuckboy shacks",
            "Vehicular Manslaughter: If you are in a vehicle you must attempt run over any player you see",
            "Stay Low: You can only move around when crouched, prone or in a vehicle",
            "FPV: You must play in first person",
            "Over the Shoulder: You can only play in 3rd person, no aiming down sights",
            "Dead Eye: You are not allowed to put any scopes on your weapons",
            "Bare Bones: You are not allowed to put any accessories on your weapons",
            "Pick Your Shots: You cannot carry more than one mag for each weapon at a time",
            "Weak Back: You cannot carry more than three items in your backpack",
            "Minimalism: You cannot use a backpack",
            "Chatty Kathy: You must use all voice chat and must tell players you will kill them before you do",
            "Cop Mode: you cannot shoot at someone until they start shooting at you",
            "Bird Watcher: You must go to every airdrop you see falling",
            "Lazy Looter: You cannot loot airdrops",
            "You must go to the center of the circle as fast as you can every time the circle shrinks",
            "Slim Pickings: You can only loot airdrops, get a vehicle and find that drop",
            "World War II: Kar98k, Double Barrel (S686), Pump Action (S1897), P1911, & Revolver (R1895) only. No attachments besides chokes and bullet loops and no sights besides 8X and higher. Bandages and First Aid Kits only.",
            "Gephyrophobia: You are deathly afraid of bridges, you must swim or use boats every time you encounter a bridge",
            "Heads Up: You must fire at least 3 warning shots close to the enemy before hitting them",
            "Viking Funeral: If you have a Molotov you must throw it on an enemies body after killing them in order to send them to Valhalla",
            "No Cowards: If you are standing and you are shot at you cannot lay down or crouch until the enemy is dead or you have gone far away from them",
            "Afraid of heights: you can't go above the first story of any building.",
            "Max Payne Mode: Black trench coat, no backpack, level 1 vest only, Micro UZI and 9mm pistol only, and pain killers",
            "Spread Out: If in a group, all party members must pick separate locations to drop and then meet up",
            "Carpooling Sucks: If in a group, everyone must drive their own vehicle",
            "Big Target: You must try to find a red shirt and wear it",
            "xxXMontageXxx: If you have a scoped weapon, you must do a 360 before you can shoot.",
            "Road Warrior: Have to stay on roads, can be dirt, gravel, asphalt or tarmac(runway. You can loot buildings but must leave them as soon as you are done looting.",
            "Roadrage: Only vehicle kills, no guns or grenades",
            "Punch-squad: Drop where the most people drop and try to get as many punch kills as possible before the first circle",
            "Guardian Angel: Follow the first player/squad you find and protect them from other without letting them know that you are there, you may not harm them. If they die they you commit suicide.",
            "Paraglider: Jump in the middle of the plane path and pull your chute straight away. Glide to the furthest point away from the path.",
            "Blitz: Jump as soon as possible and dive straight down. Find a gun and then hunt other players as fast as possible. No non-gun loot before the first circle.",
            "COD Master: No-scoping only.",
            "Realism: First person only and only one primary.Lean around every corner",
            "Lucky-campers: Pick a grid square (or the one the Strat Roulette generated) and do not leave it. Kill anyone who comes inside and pray for the circle to be kind.",
            "SEAL: Find a boat ASAP, no looting before finding it, then only travel in the boat and when you want to loot then you must keep your boat within viewing distance of the buildings you loot.",
            "Squad roll out: Everyone in the squad takes a different vehicle.",
            "Silence is Golden: No speaking to teammates only can communicate through in game movements",
            "Hitman: Silenced pistol only, any pistol attachment. No armor/helmet",
            "Farmer: Jump from plane with the AFK'ers",
            "The Huntsman: Crossbow, shotguns, kar98k, revolver, m24, machete, sickle only.",
            "Crossdresser: You must switch clothes with every person you kill.",
            "Low Profile: While moving on foot you can only crawl. (Once stationary any stance is allowed. Vehicles allowed.)",
            "Medic: If in a squad you must have a designated medic who can only carry medical supplies, they are not allowed to harm others.",
            "Vape Nation: You must throw a smoke grenade every time you see an enemy.",
            "Grenadier: Your only weapons are grenades and melee.",
            "LEEROY JENKINS: You must always run into the red zone if close. No hiding/camping/staying in buildings except to loot.",
            "This is my Rifle: The first gun you find, whether it be a pistol, shotgun, crossbow, etc, is the only weapon you can use for the game."
    );

    public Strats() {
    }

    public String getRandomStrat() {
        Random r = new Random();
        int n = r.nextInt(strats.size()) + 1;
        return strats.get(n - 1);
    }
}
