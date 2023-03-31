package ru.savenkov.dota_server.config;

import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class DotabuffInfo {
    public DotabuffInfo() {
    }

    public final int heroes_count = HEROES.values().length;
    public enum HEROES{
        ABADDON ,
        ALCHEMIST,
        ANCIENT_APPARITION,
        ANTI_MAGE,
        ARC_WARDEN,
        AXE,
        BANE,
        BATRIDER,
        BEASTMASTER,
        BLOODSEEKER,
        BOUNTY_HUNTER,
        BREWMASTER,
        BRISTLEBACK,
        BROODMOTHER,
        CENTAUR_WARRUNNER,
        CHAOS_KNIGHT,
        CHEN,
        CLINKZ,
        CLOCKWERK,
        CRYSTAL_MAIDEN,
        DARK_SEER,
        DARK_WILLOW,
        DAWNBREAKER,
        DAZZLE,
        DEATH_PROPHET,
        DISRUPTOR,
        DOOM,
        DRAGON_KNIGHT,
        DROW_RANGER,
        EARTH_SPIRIT,
        EARTHSHAKER,
        ELDER_TITAN,
        EMBER_SPIRIT,
        ENCHANTRESS,
        ENIGMA,
        FACELESS_VOID,
        GRIMSTROKE,
        GYROCOPTER,
        HOODWINK,
        HUSKAR,
        INVOKER,
        IO,
        JAKIRO,
        JUGGERNAUT,
        KEEPER_OF_THE_LIGHT,
        KUNKKA,
        LEGION_COMMANDER,
        LESHRAC,
        LICH,
        LIFESTEALER,
        LINA,
        LION,
        LONE_DRUID,
        LUNA,
        LYCAN,
        MAGNUS,
        MARCI,
        MARS,
        MEDUSA,
        MEEPO,
        MIRANA,
        MONKEY_KING,
        MORPHLING,
        MUERTA,
        NAGA_SIREN,
        NATURES_PROPHET,
        NECROPHOS,
        NIGHT_STALKER,
        NYX_ASSASSIN,
        OGRE_MAGI,
        OMNIKNIGHT,
        ORACLE,
        OUTWORLD_DESTROYER,
        PANGOLIER,
        PHANTOM_ASSASSIN,
        PHANTOM_LANCER,
        PHOENIX,
        PRIMAL_BEAST,
        PUCK,
        PUDGE,
        PUGNA,
        QUEEN_OF_PAIN,
        RAZOR,
        RIKI,
        RUBICK,
        SAND_KING,
        SHADOW_DEMON,
        SHADOW_FIEND,
        SHADOW_SHAMAN,
        SILENCER,
        SKYWRATH_MAGE,
        SLARDAR,
        SLARK,
        SNAPFIRE,
        SNIPER,
        SPECTRE,
        SPIRIT_BREAKER,
        STORM_SPIRIT,
        SVEN,
        TECHIES,
        TEMPLAR_ASSASSIN,
        TERRORBLADE,
        TIDEHUNTER,
        TIMBERSAW,
        TINKER,
        TINY,
        TREANT_PROTECTOR,
        TROLL_WARLORD,
        TUSK,
        UNDERLORD,
        UNDYING,
        URSA,
        VENGEFUL_SPIRIT,
        VENOMANCER,
        VIPER,
        VISAGE,
        VOID_SPIRIT,
        WARLOCK,
        WEAVER,
        WINDRANGER,
        WINTER_WYVERN,
        WITCH_DOCTOR,
        WRAITH_KING,
        ZEUS
    }
    public final Map<HEROES, String> heroesRefs = new HashMap<HEROES, String>(){{
        put(HEROES.ABADDON, "https://www.dotabuff.com/heroes/abaddon");
        put(HEROES.ALCHEMIST, "https://www.dotabuff.com/heroes/alchemist");
        put(HEROES.ANCIENT_APPARITION, "https://www.dotabuff.com/heroes/ancient-apparition");
        put(HEROES.ANTI_MAGE, "https://www.dotabuff.com/heroes/anti-mage");
        put(HEROES.ARC_WARDEN, "https://www.dotabuff.com/heroes/arc-warden");
        put(HEROES.AXE, "https://www.dotabuff.com/heroes/axe");
        put(HEROES.BANE, "https://www.dotabuff.com/heroes/bane");
        put(HEROES.BATRIDER, "https://www.dotabuff.com/heroes/batrider");
        put(HEROES.BEASTMASTER, "https://www.dotabuff.com/heroes/beastmaster");
        put(HEROES.BLOODSEEKER, "https://www.dotabuff.com/heroes/bloodseeker");
        put(HEROES.BOUNTY_HUNTER, "https://www.dotabuff.com/heroes/bounty-hunter");
        put(HEROES.BREWMASTER, "https://www.dotabuff.com/heroes/brewmaster");
        put(HEROES.BRISTLEBACK, "https://www.dotabuff.com/heroes/bristleback");
        put(HEROES.BROODMOTHER, "https://www.dotabuff.com/heroes/broodmother");
        put(HEROES.CENTAUR_WARRUNNER, "https://www.dotabuff.com/heroes/centaur-warrunner");
        put(HEROES.CHAOS_KNIGHT, "https://www.dotabuff.com/heroes/chaos-knight");
        put(HEROES.CHEN, "https://www.dotabuff.com/heroes/chen");
        put(HEROES.CLINKZ, "https://www.dotabuff.com/heroes/clinkz");
        put(HEROES.CLOCKWERK, "https://www.dotabuff.com/heroes/clockwerk");
        put(HEROES.CRYSTAL_MAIDEN, "https://www.dotabuff.com/heroes/crystal-maiden");
        put(HEROES.DARK_SEER, "https://www.dotabuff.com/heroes/dark-seer");
        put(HEROES.DARK_WILLOW, "https://www.dotabuff.com/heroes/dark-willow");
        put(HEROES.DAWNBREAKER, "https://www.dotabuff.com/heroes/dawnbreaker");
        put(HEROES.DAZZLE, "https://www.dotabuff.com/heroes/dazzle");
        put(HEROES.DEATH_PROPHET, "https://www.dotabuff.com/heroes/death-prophet");
        put(HEROES.DISRUPTOR, "https://www.dotabuff.com/heroes/disruptor");
        put(HEROES.DOOM, "https://www.dotabuff.com/heroes/doom");
        put(HEROES.DRAGON_KNIGHT, "https://www.dotabuff.com/heroes/dragon-knight");
        put(HEROES.DROW_RANGER, "https://www.dotabuff.com/heroes/drow-ranger");
        put(HEROES.EARTH_SPIRIT, "https://www.dotabuff.com/heroes/earth-spirit");
        put(HEROES.EARTHSHAKER, "https://www.dotabuff.com/heroes/earthshaker");
        put(HEROES.ELDER_TITAN, "https://www.dotabuff.com/heroes/elder-titan");
        put(HEROES.EMBER_SPIRIT, "https://www.dotabuff.com/heroes/ember-spirit");
        put(HEROES.ENCHANTRESS, "https://www.dotabuff.com/heroes/enchantress");
        put(HEROES.ENIGMA, "https://www.dotabuff.com/heroes/enigma");
        put(HEROES.FACELESS_VOID, "https://www.dotabuff.com/heroes/faceless-void");
        put(HEROES.GRIMSTROKE, "https://www.dotabuff.com/heroes/grimstroke");
        put(HEROES.GYROCOPTER, "https://www.dotabuff.com/heroes/gyrocopter");
        put(HEROES.HOODWINK, "https://www.dotabuff.com/heroes/hoodwink");
        put(HEROES.HUSKAR, "https://www.dotabuff.com/heroes/huskar");
        put(HEROES.INVOKER, "https://www.dotabuff.com/heroes/invoker");
        put(HEROES.IO, "https://www.dotabuff.com/heroes/io");
        put(HEROES.JAKIRO, "https://www.dotabuff.com/heroes/jakiro");
        put(HEROES.JUGGERNAUT, "https://www.dotabuff.com/heroes/juggernaut");
        put(HEROES.KEEPER_OF_THE_LIGHT, "https://www.dotabuff.com/heroes/keeper-of-the-light");
        put(HEROES.KUNKKA, "https://www.dotabuff.com/heroes/kunkka");
        put(HEROES.LEGION_COMMANDER, "https://www.dotabuff.com/heroes/legion-commander");
        put(HEROES.LESHRAC, "https://www.dotabuff.com/heroes/leshrac");
        put(HEROES.LICH, "https://www.dotabuff.com/heroes/lich");
        put(HEROES.LIFESTEALER, "https://www.dotabuff.com/heroes/lifestealer");
        put(HEROES.LINA, "https://www.dotabuff.com/heroes/lina");
        put(HEROES.LION, "https://www.dotabuff.com/heroes/lion");
        put(HEROES.LONE_DRUID, "https://www.dotabuff.com/heroes/lone-druid");
        put(HEROES.LUNA, "https://www.dotabuff.com/heroes/luna");
        put(HEROES.LYCAN, "https://www.dotabuff.com/heroes/lycan");
        put(HEROES.MAGNUS, "https://www.dotabuff.com/heroes/magnus");
        put(HEROES.MARCI, "https://www.dotabuff.com/heroes/marci");
        put(HEROES.MARS, "https://www.dotabuff.com/heroes/mars");
        put(HEROES.MEDUSA, "https://www.dotabuff.com/heroes/medusa");
        put(HEROES.MEEPO, "https://www.dotabuff.com/heroes/meepo");
        put(HEROES.MIRANA, "https://www.dotabuff.com/heroes/mirana");
        put(HEROES.MONKEY_KING, "https://www.dotabuff.com/heroes/monkey-king");
        put(HEROES.MORPHLING, "https://www.dotabuff.com/heroes/morphling");
        put(HEROES.MUERTA, "https://www.dotabuff.com/heroes/muerta");
        put(HEROES.NAGA_SIREN, "https://www.dotabuff.com/heroes/naga-siren");
        put(HEROES.NATURES_PROPHET, "https://www.dotabuff.com/heroes/natures-prophet");
        put(HEROES.NECROPHOS, "https://www.dotabuff.com/heroes/necrophos");
        put(HEROES.NIGHT_STALKER, "https://www.dotabuff.com/heroes/night-stalker");
        put(HEROES.NYX_ASSASSIN, "https://www.dotabuff.com/heroes/nyx-assassin");
        put(HEROES.OGRE_MAGI, "https://www.dotabuff.com/heroes/ogre-magi");
        put(HEROES.OMNIKNIGHT, "https://www.dotabuff.com/heroes/omniknight");
        put(HEROES.ORACLE, "https://www.dotabuff.com/heroes/oracle");
        put(HEROES.OUTWORLD_DESTROYER, "https://www.dotabuff.com/heroes/outworld-destroyer");
        put(HEROES.PANGOLIER, "https://www.dotabuff.com/heroes/pangolier");
        put(HEROES.PHANTOM_ASSASSIN, "https://www.dotabuff.com/heroes/phantom-assassin");
        put(HEROES.PHANTOM_LANCER, "https://www.dotabuff.com/heroes/phantom-lancer");
        put(HEROES.PHOENIX, "https://www.dotabuff.com/heroes/phoenix");
        put(HEROES.PRIMAL_BEAST, "https://www.dotabuff.com/heroes/primal-beast");
        put(HEROES.PUCK, "https://www.dotabuff.com/heroes/puck");
        put(HEROES.PUDGE, "https://www.dotabuff.com/heroes/pudge");
        put(HEROES.PUGNA, "https://www.dotabuff.com/heroes/pugna");
        put(HEROES.QUEEN_OF_PAIN, "https://www.dotabuff.com/heroes/queen-of-pain");
        put(HEROES.RAZOR, "https://www.dotabuff.com/heroes/razor");
        put(HEROES.RIKI, "https://www.dotabuff.com/heroes/riki");
        put(HEROES.RUBICK, "https://www.dotabuff.com/heroes/rubick");
        put(HEROES.SAND_KING, "https://www.dotabuff.com/heroes/sand-king");
        put(HEROES.SHADOW_DEMON, "https://www.dotabuff.com/heroes/shadow-demon");
        put(HEROES.SHADOW_FIEND, "https://www.dotabuff.com/heroes/shadow-fiend");
        put(HEROES.SHADOW_SHAMAN, "https://www.dotabuff.com/heroes/shadow-shaman");
        put(HEROES.SILENCER, "https://www.dotabuff.com/heroes/silencer");
        put(HEROES.SKYWRATH_MAGE, "https://www.dotabuff.com/heroes/skywrath-mage");
        put(HEROES.SLARDAR, "https://www.dotabuff.com/heroes/slardar");
        put(HEROES.SLARK, "https://www.dotabuff.com/heroes/slark");
        put(HEROES.SNAPFIRE, "https://www.dotabuff.com/heroes/snapfire");
        put(HEROES.SNIPER, "https://www.dotabuff.com/heroes/sniper");
        put(HEROES.SPECTRE, "https://www.dotabuff.com/heroes/spectre");
        put(HEROES.SPIRIT_BREAKER, "https://www.dotabuff.com/heroes/spirit-breaker");
        put(HEROES.STORM_SPIRIT, "https://www.dotabuff.com/heroes/storm-spirit");
        put(HEROES.SVEN, "https://www.dotabuff.com/heroes/sven");
        put(HEROES.TECHIES, "https://www.dotabuff.com/heroes/techies");
        put(HEROES.TEMPLAR_ASSASSIN, "https://www.dotabuff.com/heroes/templar-assassin");
        put(HEROES.TERRORBLADE, "https://www.dotabuff.com/heroes/terrorblade");
        put(HEROES.TIDEHUNTER, "https://www.dotabuff.com/heroes/tidehunter");
        put(HEROES.TIMBERSAW, "https://www.dotabuff.com/heroes/timbersaw");
        put(HEROES.TINKER, "https://www.dotabuff.com/heroes/tinker");
        put(HEROES.TINY, "https://www.dotabuff.com/heroes/tiny");
        put(HEROES.TREANT_PROTECTOR, "https://www.dotabuff.com/heroes/treant-protector");
        put(HEROES.TROLL_WARLORD, "https://www.dotabuff.com/heroes/troll-warlord");
        put(HEROES.TUSK, "https://www.dotabuff.com/heroes/tusk");
        put(HEROES.UNDERLORD, "https://www.dotabuff.com/heroes/underlord");
        put(HEROES.UNDYING, "https://www.dotabuff.com/heroes/undying");
        put(HEROES.URSA, "https://www.dotabuff.com/heroes/ursa");
        put(HEROES.VENGEFUL_SPIRIT, "https://www.dotabuff.com/heroes/vengeful-spirit");
        put(HEROES.VENOMANCER, "https://www.dotabuff.com/heroes/venomancer");
        put(HEROES.VIPER, "https://www.dotabuff.com/heroes/viper");
        put(HEROES.VISAGE, "https://www.dotabuff.com/heroes/visage");
        put(HEROES.VOID_SPIRIT, "https://www.dotabuff.com/heroes/void-spirit");
        put(HEROES.WARLOCK, "https://www.dotabuff.com/heroes/warlock");
        put(HEROES.WEAVER, "https://www.dotabuff.com/heroes/weaver");
        put(HEROES.WINDRANGER, "https://www.dotabuff.com/heroes/windranger");
        put(HEROES.WINTER_WYVERN, "https://www.dotabuff.com/heroes/winter-wyvern");
        put(HEROES.WITCH_DOCTOR, "https://www.dotabuff.com/heroes/witch-doctor");
        put(HEROES.WRAITH_KING, "https://www.dotabuff.com/heroes/wraith-king");
        put(HEROES.ZEUS, "https://www.dotabuff.com/heroes/zeus");
    }};
    public final Map<HEROES, String> countersRefs = new HashMap<HEROES, String>() {{
        put(HEROES.ABADDON, "https://www.dotabuff.com/heroes/abaddon/counters");
        put(HEROES.ALCHEMIST, "https://www.dotabuff.com/heroes/alchemist/counters");
        put(HEROES.ANCIENT_APPARITION, "https://www.dotabuff.com/heroes/ancient-apparition/counters");
        put(HEROES.ANTI_MAGE, "https://www.dotabuff.com/heroes/anti-mage/counters");
        put(HEROES.ARC_WARDEN, "https://www.dotabuff.com/heroes/arc-warden/counters");
        put(HEROES.AXE, "https://www.dotabuff.com/heroes/axe/counters");
        put(HEROES.BANE, "https://www.dotabuff.com/heroes/bane/counters");
        put(HEROES.BATRIDER, "https://www.dotabuff.com/heroes/batrider/counters");
        put(HEROES.BEASTMASTER, "https://www.dotabuff.com/heroes/beastmaster/counters");
        put(HEROES.BLOODSEEKER, "https://www.dotabuff.com/heroes/bloodseeker/counters");
        put(HEROES.BOUNTY_HUNTER, "https://www.dotabuff.com/heroes/bounty-hunter/counters");
        put(HEROES.BREWMASTER, "https://www.dotabuff.com/heroes/brewmaster/counters");
        put(HEROES.BRISTLEBACK, "https://www.dotabuff.com/heroes/bristleback/counters");
        put(HEROES.BROODMOTHER, "https://www.dotabuff.com/heroes/broodmother/counters");
        put(HEROES.CENTAUR_WARRUNNER, "https://www.dotabuff.com/heroes/centaur-warrunner/counters");
        put(HEROES.CHAOS_KNIGHT, "https://www.dotabuff.com/heroes/chaos-knight/counters");
        put(HEROES.CHEN, "https://www.dotabuff.com/heroes/chen/counters");
        put(HEROES.CLINKZ, "https://www.dotabuff.com/heroes/clinkz/counters");
        put(HEROES.CLOCKWERK, "https://www.dotabuff.com/heroes/clockwerk/counters");
        put(HEROES.CRYSTAL_MAIDEN, "https://www.dotabuff.com/heroes/crystal-maiden/counters");
        put(HEROES.DARK_SEER, "https://www.dotabuff.com/heroes/dark-seer/counters");
        put(HEROES.DARK_WILLOW, "https://www.dotabuff.com/heroes/dark-willow/counters");
        put(HEROES.DAWNBREAKER, "https://www.dotabuff.com/heroes/dawnbreaker/counters");
        put(HEROES.DAZZLE, "https://www.dotabuff.com/heroes/dazzle/counters");
        put(HEROES.DEATH_PROPHET, "https://www.dotabuff.com/heroes/death-prophet/counters");
        put(HEROES.DISRUPTOR, "https://www.dotabuff.com/heroes/disruptor/counters");
        put(HEROES.DOOM, "https://www.dotabuff.com/heroes/doom/counters");
        put(HEROES.DRAGON_KNIGHT, "https://www.dotabuff.com/heroes/dragon-knight/counters");
        put(HEROES.DROW_RANGER, "https://www.dotabuff.com/heroes/drow-ranger/counters");
        put(HEROES.EARTH_SPIRIT, "https://www.dotabuff.com/heroes/earth-spirit/counters");
        put(HEROES.EARTHSHAKER, "https://www.dotabuff.com/heroes/earthshaker/counters");
        put(HEROES.ELDER_TITAN, "https://www.dotabuff.com/heroes/elder-titan/counters");
        put(HEROES.EMBER_SPIRIT, "https://www.dotabuff.com/heroes/ember-spirit/counters");
        put(HEROES.ENCHANTRESS, "https://www.dotabuff.com/heroes/enchantress/counters");
        put(HEROES.ENIGMA, "https://www.dotabuff.com/heroes/enigma/counters");
        put(HEROES.FACELESS_VOID, "https://www.dotabuff.com/heroes/faceless-void/counters");
        put(HEROES.GRIMSTROKE, "https://www.dotabuff.com/heroes/grimstroke/counters");
        put(HEROES.GYROCOPTER, "https://www.dotabuff.com/heroes/gyrocopter/counters");
        put(HEROES.HOODWINK, "https://www.dotabuff.com/heroes/hoodwink/counters");
        put(HEROES.HUSKAR, "https://www.dotabuff.com/heroes/huskar/counters");
        put(HEROES.INVOKER, "https://www.dotabuff.com/heroes/invoker/counters");
        put(HEROES.IO, "https://www.dotabuff.com/heroes/io/counters");
        put(HEROES.JAKIRO, "https://www.dotabuff.com/heroes/jakiro/counters");
        put(HEROES.JUGGERNAUT, "https://www.dotabuff.com/heroes/juggernaut/counters");
        put(HEROES.KEEPER_OF_THE_LIGHT, "https://www.dotabuff.com/heroes/keeper-of-the-light/counters");
        put(HEROES.KUNKKA, "https://www.dotabuff.com/heroes/kunkka/counters");
        put(HEROES.LEGION_COMMANDER, "https://www.dotabuff.com/heroes/legion-commander/counters");
        put(HEROES.LESHRAC, "https://www.dotabuff.com/heroes/leshrac/counters");
        put(HEROES.LICH, "https://www.dotabuff.com/heroes/lich/counters");
        put(HEROES.LIFESTEALER, "https://www.dotabuff.com/heroes/lifestealer/counters");
        put(HEROES.LINA, "https://www.dotabuff.com/heroes/lina/counters");
        put(HEROES.LION, "https://www.dotabuff.com/heroes/lion/counters");
        put(HEROES.LONE_DRUID, "https://www.dotabuff.com/heroes/lone-druid/counters");
        put(HEROES.LUNA, "https://www.dotabuff.com/heroes/luna/counters");
        put(HEROES.LYCAN, "https://www.dotabuff.com/heroes/lycan/counters");
        put(HEROES.MAGNUS, "https://www.dotabuff.com/heroes/magnus/counters");
        put(HEROES.MARCI, "https://www.dotabuff.com/heroes/marci/counters");
        put(HEROES.MARS, "https://www.dotabuff.com/heroes/mars/counters");
        put(HEROES.MEDUSA, "https://www.dotabuff.com/heroes/medusa/counters");
        put(HEROES.MEEPO, "https://www.dotabuff.com/heroes/meepo/counters");
        put(HEROES.MIRANA, "https://www.dotabuff.com/heroes/mirana/counters");
        put(HEROES.MONKEY_KING, "https://www.dotabuff.com/heroes/monkey-king/counters");
        put(HEROES.MORPHLING, "https://www.dotabuff.com/heroes/morphling/counters");
        put(HEROES.MUERTA, "https://www.dotabuff.com/heroes/muerta/counters");
        put(HEROES.NAGA_SIREN, "https://www.dotabuff.com/heroes/naga-siren/counters");
        put(HEROES.NATURES_PROPHET, "https://www.dotabuff.com/heroes/natures-prophet/counters");
        put(HEROES.NECROPHOS, "https://www.dotabuff.com/heroes/necrophos/counters");
        put(HEROES.NIGHT_STALKER, "https://www.dotabuff.com/heroes/night-stalker/counters");
        put(HEROES.NYX_ASSASSIN, "https://www.dotabuff.com/heroes/nyx-assassin/counters");
        put(HEROES.OGRE_MAGI, "https://www.dotabuff.com/heroes/ogre-magi/counters");
        put(HEROES.OMNIKNIGHT, "https://www.dotabuff.com/heroes/omniknight/counters");
        put(HEROES.ORACLE, "https://www.dotabuff.com/heroes/oracle/counters");
        put(HEROES.OUTWORLD_DESTROYER, "https://www.dotabuff.com/heroes/outworld-destroyer/counters");
        put(HEROES.PANGOLIER, "https://www.dotabuff.com/heroes/pangolier/counters");
        put(HEROES.PHANTOM_ASSASSIN, "https://www.dotabuff.com/heroes/phantom-assassin/counters");
        put(HEROES.PHANTOM_LANCER, "https://www.dotabuff.com/heroes/phantom-lancer/counters");
        put(HEROES.PHOENIX, "https://www.dotabuff.com/heroes/phoenix/counters");
        put(HEROES.PRIMAL_BEAST, "https://www.dotabuff.com/heroes/primal-beast/counters");
        put(HEROES.PUCK, "https://www.dotabuff.com/heroes/puck/counters");
        put(HEROES.PUDGE, "https://www.dotabuff.com/heroes/pudge/counters");
        put(HEROES.PUGNA, "https://www.dotabuff.com/heroes/pugna/counters");
        put(HEROES.QUEEN_OF_PAIN, "https://www.dotabuff.com/heroes/queen-of-pain/counters");
        put(HEROES.RAZOR, "https://www.dotabuff.com/heroes/razor/counters");
        put(HEROES.RIKI, "https://www.dotabuff.com/heroes/riki/counters");
        put(HEROES.RUBICK, "https://www.dotabuff.com/heroes/rubick/counters");
        put(HEROES.SAND_KING, "https://www.dotabuff.com/heroes/sand-king/counters");
        put(HEROES.SHADOW_DEMON, "https://www.dotabuff.com/heroes/shadow-demon/counters");
        put(HEROES.SHADOW_FIEND, "https://www.dotabuff.com/heroes/shadow-fiend/counters");
        put(HEROES.SHADOW_SHAMAN, "https://www.dotabuff.com/heroes/shadow-shaman/counters");
        put(HEROES.SILENCER, "https://www.dotabuff.com/heroes/silencer/counters");
        put(HEROES.SKYWRATH_MAGE, "https://www.dotabuff.com/heroes/skywrath-mage/counters");
        put(HEROES.SLARDAR, "https://www.dotabuff.com/heroes/slardar/counters");
        put(HEROES.SLARK, "https://www.dotabuff.com/heroes/slark/counters");
        put(HEROES.SNAPFIRE, "https://www.dotabuff.com/heroes/snapfire/counters");
        put(HEROES.SNIPER, "https://www.dotabuff.com/heroes/sniper/counters");
        put(HEROES.SPECTRE, "https://www.dotabuff.com/heroes/spectre/counters");
        put(HEROES.SPIRIT_BREAKER, "https://www.dotabuff.com/heroes/spirit-breaker/counters");
        put(HEROES.STORM_SPIRIT, "https://www.dotabuff.com/heroes/storm-spirit/counters");
        put(HEROES.SVEN, "https://www.dotabuff.com/heroes/sven/counters");
        put(HEROES.TECHIES, "https://www.dotabuff.com/heroes/techies/counters");
        put(HEROES.TEMPLAR_ASSASSIN, "https://www.dotabuff.com/heroes/templar-assassin/counters");
        put(HEROES.TERRORBLADE, "https://www.dotabuff.com/heroes/terrorblade/counters");
        put(HEROES.TIDEHUNTER, "https://www.dotabuff.com/heroes/tidehunter/counters");
        put(HEROES.TIMBERSAW, "https://www.dotabuff.com/heroes/timbersaw/counters");
        put(HEROES.TINKER, "https://www.dotabuff.com/heroes/tinker/counters");
        put(HEROES.TINY, "https://www.dotabuff.com/heroes/tiny/counters");
        put(HEROES.TREANT_PROTECTOR, "https://www.dotabuff.com/heroes/treant-protector/counters");
        put(HEROES.TROLL_WARLORD, "https://www.dotabuff.com/heroes/troll-warlord/counters");
        put(HEROES.TUSK, "https://www.dotabuff.com/heroes/tusk/counters");
        put(HEROES.UNDERLORD, "https://www.dotabuff.com/heroes/underlord/counters");
        put(HEROES.UNDYING, "https://www.dotabuff.com/heroes/undying/counters");
        put(HEROES.URSA, "https://www.dotabuff.com/heroes/ursa/counters");
        put(HEROES.VENGEFUL_SPIRIT, "https://www.dotabuff.com/heroes/vengeful-spirit/counters");
        put(HEROES.VENOMANCER, "https://www.dotabuff.com/heroes/venomancer/counters");
        put(HEROES.VIPER, "https://www.dotabuff.com/heroes/viper/counters");
        put(HEROES.VISAGE, "https://www.dotabuff.com/heroes/visage/counters");
        put(HEROES.VOID_SPIRIT, "https://www.dotabuff.com/heroes/void-spirit/counters");
        put(HEROES.WARLOCK, "https://www.dotabuff.com/heroes/warlock/counters");
        put(HEROES.WEAVER, "https://www.dotabuff.com/heroes/weaver/counters");
        put(HEROES.WINDRANGER, "https://www.dotabuff.com/heroes/windranger/counters");
        put(HEROES.WINTER_WYVERN, "https://www.dotabuff.com/heroes/winter-wyvern/counters");
        put(HEROES.WITCH_DOCTOR, "https://www.dotabuff.com/heroes/witch-doctor/counters");
        put(HEROES.WRAITH_KING, "https://www.dotabuff.com/heroes/wraith-king/counters");
        put(HEROES.ZEUS, "https://www.dotabuff.com/heroes/zeus/counters");
    }};

    public final String[] rawHeroesString = new String[] {
            "abaddon", "alchemist",
            "ancient-apparition", "anti-mage",
            "arc-warden", "axe",
            "bane", "batrider",
            "beastmaster", "bloodseeker",
            "bounty-hunter", "brewmaster",
            "bristleback", "broodmother",
            "centaur-warrunner", "chaos-knight",
            "chen", "clinkz",
            "clockwerk", "crystal-maiden",
            "dark-seer", "dark-willow",
            "dawnbreaker", "dazzle",
            "death-prophet", "disruptor",
            "doom", "dragon-knight",
            "drow-ranger", "earth-spirit",
            "earthshaker", "elder-titan",
            "ember-spirit", "enchantress",
            "enigma", "faceless-void",
            "grimstroke", "gyrocopter",
            "hoodwink", "huskar",
            "invoker", "io",
            "jakiro", "juggernaut",
            "keeper-of-the-light", "kunkka",
            "legion-commander", "leshrac",
            "lich", "lifestealer",
            "lina", "lion",
            "lone-druid", "luna",
            "lycan", "magnus",
            "marci", "mars",
            "medusa", "meepo",
            "mirana", "monkey-king",
            "morphling", "muerta",
            "naga-siren",
            "natures-prophet", "necrophos",
            "night-stalker", "nyx-assassin",
            "ogre-magi", "omniknight",
            "oracle", "outworld-destroyer",
            "pangolier", "phantom-assassin",
            "phantom-lancer", "phoenix",
            "primal-beast", "puck",
            "pudge", "pugna",
            "queen-of-pain", "razor",
            "riki", "rubick",
            "sand-king", "shadow-demon",
            "shadow-fiend", "shadow-shaman",
            "silencer", "skywrath-mage",
            "slardar", "slark",
            "snapfire", "sniper",
            "spectre", "spirit-breaker",
            "storm-spirit", "sven",
            "techies", "templar-assassin",
            "terrorblade", "tidehunter",
            "timbersaw", "tinker",
            "tiny", "treant-protector",
            "troll-warlord", "tusk",
            "underlord", "undying",
            "ursa", "vengeful-spirit",
            "venomancer", "viper",
            "visage", "void-spirit",
            "warlock", "weaver",
            "windranger", "winter-wyvern",
            "witch-doctor", "wraith-king",
            "zeus"
    };
    //(f'[data-link-to="{data_link_to}"] td')

}

