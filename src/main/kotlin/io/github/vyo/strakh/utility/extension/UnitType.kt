package io.github.vyo.strakh.utility.extension

import bwapi.UnitType
import io.github.vyo.strakh.utility.Cost
import io.github.vyo.twig.logger.Level
import io.github.vyo.twig.logger.Logger
import java.util.*

/**
 * Created by Manuel Weidmann on 06.12.2015.
 */

val unitTypes: List<UnitType> = listOf(
        UnitType.Terran_Marine,
        UnitType.Terran_Ghost,
        UnitType.Terran_Vulture,
        UnitType.Terran_Goliath,
        UnitType.Terran_Siege_Tank_Tank_Mode,
        UnitType.Terran_SCV,
        UnitType.Terran_Wraith,
        UnitType.Terran_Science_Vessel,
        UnitType.Hero_Gui_Montag,
        UnitType.Terran_Dropship,
        UnitType.Terran_Battlecruiser,
        UnitType.Terran_Vulture_Spider_Mine,
        UnitType.Terran_Nuclear_Missile,
        UnitType.Terran_Civilian,
        UnitType.Hero_Sarah_Kerrigan,
        UnitType.Hero_Alan_Schezar,
        UnitType.Hero_Jim_Raynor_Vulture,
        UnitType.Hero_Jim_Raynor_Marine,
        UnitType.Hero_Tom_Kazansky,
        UnitType.Hero_Magellan,
        UnitType.Hero_Edmund_Duke_Tank_Mode,
        UnitType.Hero_Edmund_Duke_Siege_Mode,
        UnitType.Hero_Arcturus_Mengsk,
        UnitType.Hero_Hyperion,
        UnitType.Hero_Norad_II,
        UnitType.Terran_Siege_Tank_Siege_Mode,
        UnitType.Terran_Firebat,
        UnitType.Spell_Scanner_Sweep,
        UnitType.Terran_Medic,
        UnitType.Zerg_Larva,
        UnitType.Zerg_Egg,
        UnitType.Zerg_Zergling,
        UnitType.Zerg_Hydralisk,
        UnitType.Zerg_Ultralisk,
        UnitType.Zerg_Broodling,
        UnitType.Zerg_Drone,
        UnitType.Zerg_Overlord,
        UnitType.Zerg_Mutalisk,
        UnitType.Zerg_Guardian,
        UnitType.Zerg_Queen,
        UnitType.Zerg_Defiler,
        UnitType.Zerg_Scourge,
        UnitType.Hero_Torrasque,
        UnitType.Hero_Matriarch,
        UnitType.Zerg_Infested_Terran,
        UnitType.Hero_Infested_Kerrigan,
        UnitType.Hero_Unclean_One,
        UnitType.Hero_Hunter_Killer,
        UnitType.Hero_Devouring_One,
        UnitType.Hero_Kukulza_Mutalisk,
        UnitType.Hero_Kukulza_Guardian,
        UnitType.Hero_Yggdrasill,
        UnitType.Terran_Valkyrie,
        UnitType.Zerg_Cocoon,
        UnitType.Protoss_Corsair,
        UnitType.Protoss_Dark_Templar,
        UnitType.Zerg_Devourer,
        UnitType.Protoss_Dark_Archon,
        UnitType.Protoss_Probe,
        UnitType.Protoss_Zealot,
        UnitType.Protoss_Dragoon,
        UnitType.Protoss_High_Templar,
        UnitType.Protoss_Archon,
        UnitType.Protoss_Shuttle,
        UnitType.Protoss_Scout,
        UnitType.Protoss_Arbiter,
        UnitType.Protoss_Carrier,
        UnitType.Protoss_Interceptor,
        UnitType.Hero_Dark_Templar,
        UnitType.Hero_Zeratul,
        UnitType.Hero_Tassadar_Zeratul_Archon,
        UnitType.Hero_Fenix_Zealot,
        UnitType.Hero_Fenix_Dragoon,
        UnitType.Hero_Tassadar,
        UnitType.Hero_Mojo,
        UnitType.Hero_Warbringer,
        UnitType.Hero_Gantrithor,
        UnitType.Protoss_Reaver,
        UnitType.Protoss_Observer,
        UnitType.Protoss_Scarab,
        UnitType.Hero_Danimoth,
        UnitType.Hero_Aldaris,
        UnitType.Hero_Artanis,
        UnitType.Critter_Rhynadon,
        UnitType.Critter_Bengalaas,
        UnitType.Special_Cargo_Ship,
        UnitType.Special_Mercenary_Gunship,
        UnitType.Critter_Scantid,
        UnitType.Critter_Kakaru,
        UnitType.Critter_Ragnasaur,
        UnitType.Critter_Ursadon,
        UnitType.Zerg_Lurker_Egg,
        UnitType.Hero_Raszagal,
        UnitType.Hero_Samir_Duran,
        UnitType.Hero_Alexei_Stukov,
        UnitType.Special_Map_Revealer,
        UnitType.Hero_Gerard_DuGalle,
        UnitType.Zerg_Lurker,
        UnitType.Hero_Infested_Duran,
        UnitType.Spell_Disruption_Web,
        UnitType.Terran_Command_Center,
        UnitType.Terran_Comsat_Station,
        UnitType.Terran_Nuclear_Silo,
        UnitType.Terran_Supply_Depot,
        UnitType.Terran_Refinery,
        UnitType.Terran_Barracks,
        UnitType.Terran_Academy,
        UnitType.Terran_Factory,
        UnitType.Terran_Starport,
        UnitType.Terran_Control_Tower,
        UnitType.Terran_Science_Facility,
        UnitType.Terran_Covert_Ops,
        UnitType.Terran_Physics_Lab,
        UnitType.Terran_Machine_Shop,
        UnitType.Terran_Engineering_Bay,
        UnitType.Terran_Armory,
        UnitType.Terran_Missile_Turret,
        UnitType.Terran_Bunker,
        UnitType.Special_Crashed_Norad_II,
        UnitType.Special_Ion_Cannon,
        UnitType.Powerup_Uraj_Crystal,
        UnitType.Powerup_Khalis_Crystal,
        UnitType.Zerg_Infested_Command_Center,
        UnitType.Zerg_Hatchery,
        UnitType.Zerg_Lair,
        UnitType.Zerg_Hive,
        UnitType.Zerg_Nydus_Canal,
        UnitType.Zerg_Hydralisk_Den,
        UnitType.Zerg_Defiler_Mound,
        UnitType.Zerg_Greater_Spire,
        UnitType.Zerg_Queens_Nest,
        UnitType.Zerg_Evolution_Chamber,
        UnitType.Zerg_Ultralisk_Cavern,
        UnitType.Zerg_Spire,
        UnitType.Zerg_Spawning_Pool,
        UnitType.Zerg_Creep_Colony,
        UnitType.Zerg_Spore_Colony,
        UnitType.Zerg_Sunken_Colony,
        UnitType.Special_Overmind_With_Shell,
        UnitType.Special_Overmind,
        UnitType.Zerg_Extractor,
        UnitType.Special_Mature_Chrysalis,
        UnitType.Special_Cerebrate,
        UnitType.Special_Cerebrate_Daggoth,
        UnitType.Protoss_Nexus,
        UnitType.Protoss_Robotics_Facility,
        UnitType.Protoss_Pylon,
        UnitType.Protoss_Assimilator,
        UnitType.Protoss_Observatory,
        UnitType.Protoss_Gateway,
        UnitType.Protoss_Photon_Cannon,
        UnitType.Protoss_Citadel_of_Adun,
        UnitType.Protoss_Cybernetics_Core,
        UnitType.Protoss_Templar_Archives,
        UnitType.Protoss_Forge,
        UnitType.Protoss_Stargate,
        UnitType.Special_Stasis_Cell_Prison,
        UnitType.Protoss_Fleet_Beacon,
        UnitType.Protoss_Arbiter_Tribunal,
        UnitType.Protoss_Robotics_Support_Bay,
        UnitType.Protoss_Shield_Battery,
        UnitType.Special_Khaydarin_Crystal_Form,
        UnitType.Special_Protoss_Temple,
        UnitType.Special_XelNaga_Temple,
        UnitType.Resource_Mineral_Field,
        UnitType.Resource_Mineral_Field_Type_2,
        UnitType.Resource_Mineral_Field_Type_3,
        UnitType.Special_Independant_Starport,
        UnitType.Resource_Vespene_Geyser,
        UnitType.Special_Warp_Gate,
        UnitType.Special_Psi_Disrupter,
        UnitType.Special_Zerg_Beacon,
        UnitType.Special_Terran_Beacon,
        UnitType.Special_Protoss_Beacon,
        UnitType.Special_Zerg_Flag_Beacon,
        UnitType.Special_Terran_Flag_Beacon,
        UnitType.Special_Protoss_Flag_Beacon,
        UnitType.Special_Power_Generator,
        UnitType.Special_Overmind_Cocoon,
        UnitType.Spell_Dark_Swarm,
        UnitType.Special_Floor_Missile_Trap,
        UnitType.Special_Floor_Hatch,
        UnitType.Special_Upper_Level_Door,
        UnitType.Special_Right_Upper_Level_Door,
        UnitType.Special_Pit_Door,
        UnitType.Special_Right_Pit_Door,
        UnitType.Special_Floor_Gun_Trap,
        UnitType.Special_Wall_Missile_Trap,
        UnitType.Special_Wall_Flame_Trap,
        UnitType.Special_Right_Wall_Missile_Trap,
        UnitType.Special_Right_Wall_Flame_Trap,
        UnitType.Special_Start_Location,
        UnitType.Powerup_Flag,
        UnitType.Powerup_Young_Chrysalis,
        UnitType.Powerup_Psi_Emitter,
        UnitType.Powerup_Data_Disk,
        UnitType.Powerup_Khaydarin_Crystal,
        UnitType.Powerup_Mineral_Cluster_Type_1,
        UnitType.Powerup_Mineral_Cluster_Type_2,
        UnitType.Powerup_Protoss_Gas_Orb_Type_1,
        UnitType.Powerup_Protoss_Gas_Orb_Type_2,
        UnitType.Powerup_Zerg_Gas_Sac_Type_1,
        UnitType.Powerup_Zerg_Gas_Sac_Type_2,
        UnitType.Powerup_Terran_Gas_Tank_Type_1,
        UnitType.Powerup_Terran_Gas_Tank_Type_2,
        UnitType.None,
        UnitType.AllUnits,
        UnitType.Men,
        UnitType.Buildings,
        UnitType.Factories,
        UnitType.Unknown
)

val productionMapping: Map<UnitType, List<UnitType>> = initialiseProductionMapping()

fun UnitType.getCost(): Cost {

    val larvaCost: Int = when {
        this.equals(UnitType.Zerg_Defiler) -> 2
        this.equals(UnitType.Zerg_Drone) -> 2
        this.equals(UnitType.Zerg_Hydralisk) -> 2
        this.equals(UnitType.Zerg_Mutalisk) -> 2
        this.equals(UnitType.Zerg_Overlord) -> 2
        this.equals(UnitType.Zerg_Queen) -> 2
        this.equals(UnitType.Zerg_Scourge) -> 1
        this.equals(UnitType.Zerg_Ultralisk) -> 2
        this.equals(UnitType.Zerg_Zergling) -> 1
        else -> 0
    }


    return Cost(actions = 1,
            gas = gasPrice(),
            minerals = mineralPrice(),
            supply = supplyRequired(),
            larvae = larvaCost,
            time = buildTime()
    )
}

private fun initialiseProductionMapping(): Map<UnitType, List<UnitType>> {
    val mapping: MutableMap<UnitType, List<UnitType>> = HashMap()

    unitTypes.map {
        val producer = it
        mapping.put(producer, unitTypes.filter {
            it.whatBuilds().first.equals(producer)
        })
    }
    val logger: Logger = Logger("production mapping")
    logger.level = Level.DEBUG
    mapping.map {
        logger.debug(it.key, Pair("produces", it.value))
    }

    // return an immutable map
    return mapping.filter { true }.withDefault { listOf(UnitType.None) }
}

fun UnitType.getProducedUnitTypes(): List<UnitType> {
    return productionMapping.getOrImplicitDefault(this)
}

fun UnitType.getAllUnitTypes(): List<UnitType> {
    return unitTypes
}