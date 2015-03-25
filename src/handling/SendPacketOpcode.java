package handling;

import constants.ServerConfig;
import tools.FileoutputUtil;
import tools.HexTool;

public enum SendPacketOpcode implements WritableIntValueHolder {

    // General
    PING((short) 0x12),//11
    AUTH_RESPONSE((short) 0x16),//15
    // Login
    LOGIN_STATUS((short) 0x00),
    SEND_LINK((short) 0x01),
    LOGIN_SECOND((short) 0x02),
    CHANNEL_SELECTED((short) 0x02),
    PIC_RESPONSE((short) 0x19),
    SERVERSTATUS((short) 0x04),
    GENDER_SET((short) 0x05),
    PIN_OPERATION((short) 0x06),
    PIN_ASSIGNED((short) 0x07),
    ALL_CHARLIST((short) 0x08),
    SERVERLIST((short) 0x09),
    CHARLIST((short) 0x0A),
    SERVER_IP((short) 0x0B),
    CHAR_NAME_RESPONSE((short) 0x0C),
    ADD_NEW_CHAR_ENTRY((short) 0x0D),
    DELETE_CHAR_RESPONSE((short) 0x0E),
    CHANGE_CHANNEL((short) 0x11),//10
    CS_USE((short) 0x13),//12
    RELOG_RESPONSE((short) 0x17),//16
    REGISTER_PIC_RESPONSE((short) 0x1A),//v143
    ENABLE_RECOMMENDED((short) 0x1D),//1C
    SEND_RECOMMENDED((short) 0x1E),//1D
    PART_TIME((short) 0x1F),//1E
    SPECIAL_CREATION((short) 0x20),//1F
    SECONDPW_ERROR((short) 0x25),//24
    CHANGE_BACKGROUND((short) 0x12B),//112
    // Channel
    INVENTORY_OPERATION((short) 0x26),//25
    INVENTORY_GROW((short) 0x27),//26
    UPDATE_STATS((short) 0x28),//27
    GIVE_BUFF((short) 0x29),//28
    CANCEL_BUFF((short) 0x2A),//29
    TEMP_STATS((short) 0x2B),//2A
    TEMP_STATS_RESET((short) 0x2C),//2B
    UPDATE_SKILLS((short) 0x2D),//2C
    UPDATE_STOLEN_SKILLS((short) 0x2E),//2D
    TARGET_SKILL((short) 0x2F),//2E
    FAME_RESPONSE((short) 0x33),//32
    SHOW_STATUS_INFO((short) 0x34),//33
    FULL_CLIENT_DOWNLOAD((short) 0x35),//34
    SHOW_NOTES((short) 0x36),//35
    TROCK_LOCATIONS((short) 0x37),//36
    LIE_DETECTOR((short) 0x38),//37
    REPORT_RESPONSE((short) 0x3A),//39
    REPORT_TIME((short) 0x3B),//3A
    REPORT_STATUS((short) 0x3C),//3B
    UPDATE_MOUNT((short) 0x3E),//3d
    SHOW_QUEST_COMPLETION((short) 0x3F),//3E
    SEND_TITLE_BOX((short) 0x40),//3F
    USE_SKILL_BOOK((short) 0x41),//40
    SP_RESET((short) 0x42),//41
    AP_RESET((short) 0x43),//42
    DISTRIBUTE_ITEM((short) 0x44),//43
    EXPAND_CHARACTER_SLOTS((short) 0x45),//44
    FINISH_SORT((short) 0x4C),//4B
    FINISH_GATHER((short) 0x4D),//4C
    EXP_POTION((short) 0x43),
    REPORT_RESULT((short) 0x4D),
    TRADE_LIMIT((short) 0x46),
    UPDATE_GENDER((short) 0x51),//50
    BBS_OPERATION((short) 0x52),//51
    CHAR_INFO((short) 0x55),//v143
    PARTY_OPERATION((short) 0x56),//55
    MEMBER_SEARCH((short) 0x59),//5A
    PARTY_SEARCH((short) 0x5A),//5A
    BOOK_INFO((short) 0x5B),//5A
    CODEX_INFO_RESPONSE((short) 0x5C),//5b,
    EXPEDITION_OPERATION((short) 0x5D),//5c
    BUDDYLIST((short) 0x5E),//5d
    GUILD_OPERATION((short) 0x60),//5F
    ALLIANCE_OPERATION((short) 0x61),//60
    SPAWN_PORTAL((short) 0x62),//61
    MECH_PORTAL((short) 0x63),//62
    ECHO_MESSAGE((short) 0x64),//63
    SERVERMESSAGE((short) 0x66),//65
    ITEM_OBTAIN((short) 0x6A),//68
    PIGMI_REWARD((short) 0x6E),//6C
    OWL_OF_MINERVA((short) 0x6F),//6D
    OWL_RESULT((short) 0x70),//6E
    ENGAGE_REQUEST((short) 0x71),//6F
    ENGAGE_RESULT((short) 0x72),//70
    WEDDING_GIFT((short) 0x73),//71
    WEDDING_MAP_TRANSFER((short) 0x74),//72
    USE_CASH_PET_FOOD((short) 0x76),//74
    YELLOW_CHAT((short) 0x78),//75
    SHOP_DISCOUNT((short) 0x79),//76
    CATCH_MOB((short) 0x7A),//77
    MAKE_PLAYER_NPC((short) 0x7B),//78
    PLAYER_NPC((short) 0x7C),//79
    DISABLE_NPC((short) 0x7D),//7A
    GET_CARD((short) 0x7E),//7B
    CARD_UNK((short) 0x7F),//new143
    CARD_SET((short) 0x80),//7D
    BOOK_STATS((short) 0x81),//7E
    UPDATE_CODEX((short) 0x82),//7F
    CARD_DROPS((short) 0x83),//80
    FAMILIAR_INFO((short) 0x84),//81
    CHANGE_HOUR((short) 0x86),//83
    RESET_MINIMAP((short) 0x87),//84
    CONSULT_UPDATE((short) 0x88),//85
    CLASS_UPDATE((short) 0x89),//86
    WEB_BOARD_UPDATE((short) 0x8A),//87
    SESSION_VALUE((short) 0x8B),//88
    PARTY_VALUE((short) 0x8C),//89
    MAP_VALUE((short) 0x8D),//8A
    EXP_BONUS((short) 0x8E),//8C
    POTION_BONUS((short) 0x8F),//8D
    SEND_PEDIGREE((short) 0x90),//8E
    OPEN_FAMILY((short) 0x92),//143
    FAMILY_MESSAGE((short) 0x8E),
    FAMILY_INVITE((short) 0x999),
    FAMILY_JUNIOR((short) 0x93),//90
    SENIOR_MESSAGE((short) 0x94),//91
    FAMILY((short) 0x97),//94
    REP_INCREASE((short) 0x98),//95
    FAMILY_LOGGEDIN((short) 0x99),//96
    FAMILY_BUFF((short) 0x9A),//97
    FAMILY_USE_REQUEST((short) 0x9B),//98
    LEVEL_UPDATE((short) 0x9C),//99
    MARRIAGE_UPDATE((short) 0x9D),//9A
    JOB_UPDATE((short) 0x9E),//9B
    MAPLE_TV_MSG((short) 0x8D),
    AVATAR_MEGA_RESULT((short) 0x107),//FF
    AVATAR_MEGA((short) 0x108),//100
    AVATAR_MEGA_REMOVE((short) 0x109),//101
    POPUP2((short) 0x9D),
    CANCEL_NAME_CHANGE((short) 0x9E),
    CANCEL_WORLD_TRANSFER((short) 0x9F),
    CLOSE_HIRED_MERCHANT((short) 0xA3),//A0
    GM_POLICE((short) 0xA4),//A1
    TREASURE_BOX((short) 0xA5),//A2
    NEW_YEAR_CARD((short) 0xA6),//A3
    RANDOM_MORPH((short) 0xA7),//A4
    CANCEL_NAME_CHANGE_2((short) 0xA9),//A6
    SLOT_UPDATE((short) 0xAC),//A7
    FOLLOW_REQUEST((short) 0xAD),//A8
    TOP_MSG((short) 0xAE),//A9
    MID_MSG((short) 0xB2),//AB
    CLEAR_MID_MSG((short) 0xB3),//AC
    SPECIAL_MSG((short) 0xB4),//AD
    MAPLE_ADMIN_MSG((short) 0xB5),//AE
    CAKE_VS_PIE_MSG((short) 0xB6),//AF
    GM_STORY_BOARD((short) 0xB7),//B0
    INVENTORY_FULL((short) 0xB8),//B1
    UPDATE_JAGUAR((short) 0xB7),//B1
    YOUR_INFORMATION((short) 0xB9),//B2
    FIND_FRIEND((short) 0xBA),//B3
    VISITOR((short) 0xBB),//B4
    PINKBEAN_CHOCO((short) 0xBC),//B5
    PAM_SONG((short) 0xBD),//B6
    AUTO_CC_MSG((short) 0xBE),//b7
    DISALLOW_DELIVERY_QUEST((short) 0xC2),//bb
    ULTIMATE_EXPLORER((short) 0xC3),//BC
    SPECIAL_STAT((short) 0xC4), //also profession_info //BD
    UPDATE_IMP_TIME((short) 0xC5),//BE
    ITEM_POT((short) 0xC6),//BF
    MULUNG_MESSAGE((short) 0xC9),//C2
    GIVE_CHARACTER_SKILL((short) 0xCA),//C3
    MULUNG_DOJO_RANKING((short) 0xCF),//C8
    UPDATE_INNER_ABILITY((short) 0xD4),//CD
    EQUIP_STOLEN_SKILL((short) 0xD5),//CE
    REPLACE_SKILLS((short) 0xD5),//CE
    INNER_ABILITY_MSG((short) 0xD6),//CF
    ENABLE_INNER_ABILITY((short) 0xD7),//D0
    DISABLE_INNER_ABILITY((short) 0xD8),//D1
    UPDATE_HONOUR((short) 0xD9),//D2
    AZWAN_UNKNOWN((short) 0xDA),//D3 //probably circulator shit?
    AZWAN_RESULT((short) 0xDB),//D4
    AZWAN_KILLED((short) 0xDC),//D5
    CIRCULATOR_ON_LEVEL((short) 0xDD),//D6
    SILENT_CRUSADE_MSG((short) 0xDE),//D7
    SILENT_CRUSADE_SHOP((short) 0xDF),//D8
    SET_OBJECT_STATE((short) 0xEF),//E8
    POPUP((short) 0xF0),//E9
    MINIMAP_ARROW((short) 0xF4),//ED
    UNLOCK_CHARGE_SKILL((short) 0xFA),//F2
    LOCK_CHARGE_SKILL((short) 0xFB),//F3
    CANDY_RANKING((short) 0xFF),//F8
    ATTENDANCE((short) 0x10A),//102
    MESSENGER_OPEN((short) 0x10B),//103
    EVENT_CROWN((short) 0x10D),//105
    MAGIC_WHEEL((short) 0x123),//109
    REWARD((short) 0x124),//10B
    SKILL_MACRO((short) 0x125),//10C
    WARP_TO_MAP((short) 0x126),//10D
    FARM_OPEN((short) 0x127),//10E
    CS_OPEN((short) 0x129),//110
    REMOVE_BG_LAYER((short) 0x12A),//111
    SET_MAP_OBJECT_VISIBLE((short) 0x12B),//112
    RESET_SCREEN((short) 0x12C),//113
    MAP_BLOCKED((short) 0x12D),//114
    SERVER_BLOCKED((short) 0x12E),//115
    PARTY_BLOCKED((short) 0x12F),//116
    SHOW_EQUIP_EFFECT((short) 0x130),//117
    MULTICHAT((short) 0x134),//118
    WHISPER((short) 0x135),//119
    SPOUSE_CHAT((short) 0x137),//11B
    BOSS_ENV((short) 0x138),//11C
    MOVE_ENV((short) 0x139),//11E
    UPDATE_ENV((short) 0x13A),//11F
    MAP_EFFECT((short) 0x13C),//120
    CASH_SONG((short) 0x13D),//121
    GM_EFFECT((short) 0x13E),//122
    OX_QUIZ((short) 0x13F),//123
    GMEVENT_INSTRUCTIONS((short) 0x141),//124
    CLOCK((short) 0x142),//125
    BOAT_MOVE((short) 0x142),//126
    BOAT_STATE((short) 0x143),//128
    STOP_CLOCK((short) 0x148),//12D
    ARIANT_SCOREBOARD((short) 0x14A),//12F
    PYRAMID_UPDATE((short) 0x14E),//131
    PYRAMID_RESULT((short) 0x14F),//132
    QUICK_SLOT((short) 0x151),//134
    MOVE_PLATFORM((short) 0x153),//135
    PYRAMID_KILL_COUNT((short) 0x155),//137,
    PVP_INFO((short) 0x154),//136
    DIRECTION_STATUS((short) 0x157),//139
    GAIN_FORCE((short) 0x158),//13A
    ACHIEVEMENT_RATIO((short) 0x159),//13B
    QUICK_MOVE((short) 0x15A),//13C
    SPAWN_PLAYER((short) 0x165),//144
    REMOVE_PLAYER_FROM_MAP((short) 0x166),//145
    CHATTEXT((short) 0x167),//146
    CHATTEXT_1((short) 0x168),//147
    CHALKBOARD((short) 0x169),//148
    UPDATE_CHAR_BOX((short) 0x16A),//149
    SHOW_CONSUME_EFFECT((short) 0x16C),//14a
    SHOW_SCROLL_EFFECT((short) 0x16D),//14b
    SHOW_MAGNIFYING_EFFECT((short) 0x16E),//14c
    SHOW_POTENTIAL_RESET((short) 0x16F),//14d
    SHOW_FIREWORKS_EFFECT((short) 0x170),//14e
    SHOW_NEBULITE_EFFECT((short) 0x171),//14f
    SHOW_FUSION_EFFECT((short) 0x172),//150
    PVP_ATTACK((short) 0x140),
    PVP_MIST((short) 0x141),
    PVP_COOL((short) 0x142),
    TESLA_TRIANGLE((short) 0x17C),//0x15C //17D
    FOLLOW_EFFECT((short) 0x15D),
    SHOW_PQ_REWARD((short) 0x15E),
    CRAFT_EFFECT((short) 0x182),//15F
    CRAFT_COMPLETE((short) 0x183),//160
    HARVESTED((short) 0x185),//161
    PLAYER_DAMAGED((short) 0x165),
    NETT_PYRAMID((short) 0x166),
    SET_PHASE((short) 0x167),
    PAMS_SONG((short) 0x168),
    SPAWN_PET((short) 0x190),//16B
    SPAWN_PET_2((short) 0x192),//16D
    MOVE_PET((short) 0x193),//16E
    PET_CHAT((short) 0x194),//16F
    PET_NAMECHANGE((short) 0x195),//170
    PET_EXCEPTION_LIST((short) 0x196),//171
    PET_COLOR((short) 0x197),//172
    PET_SIZE((short) 0x198),//173
    PET_COMMAND((short) 0x199),//174
    DRAGON_SPAWN((short) 0x19A),//175
    INNER_ABILITY_RESET_MSG((short) 0x999),//173
    DRAGON_MOVE((short) 0x19B),//176
    DRAGON_REMOVE((short) 0x19C),//177
    ANDROID_SPAWN((short) 0x19D),//178
    ANDROID_MOVE((short) 0x19E),//179
    ANDROID_EMOTION((short) 0x19F),//17A
    ANDROID_UPDATE((short) 0x1A0),//17B
    ANDROID_DEACTIVATED((short) 0x1A1), //17C 
    SPAWN_FAMILIAR((short) 0x1A8),//183
    MOVE_FAMILIAR((short) 0x1A9),//184
    TOUCH_FAMILIAR((short) 0x1AA),//185
    ATTACK_FAMILIAR((short) 0x1AB),//186
    RENAME_FAMILIAR((short) 0x1AC),//187
    SPAWN_FAMILIAR_2((short) 0x1AD),//188
    UPDATE_FAMILIAR((short) 0x1AE),//189
    HAKU_CHANGE_1((short) 0x1A2),//18A
    HAKU_CHANGE_0((short) 0x1A5),//18B
    HAKU_MOVE((short) 0x1B0),//18B
    HAKU_UNK((short) 0x1B1),//18C
    HAKU_CHANGE((short) 0x1B2),//18D
    SPAWN_HAKU((short) 0x1B5),//190
    MOVE_PLAYER((short) 0x1B8),//193
    CLOSE_RANGE_ATTACK((short) 0x1BA),//195
    RANGED_ATTACK((short) 0x1BB),//196
    MAGIC_ATTACK((short) 0x1BC),//197
    ENERGY_ATTACK((short) 0x1BD),//198
    SKILL_EFFECT((short) 0x1BE),//199
    MOVE_ATTACK((short) 0x1BF),//19A
    CANCEL_SKILL_EFFECT((short) 0x1C0),//19B
    DAMAGE_PLAYER((short) 0x1C1),//19C
    FACIAL_EXPRESSION((short) 0x1C2),//19D
    SHOW_EFFECT((short) 0x1C4),//19F
    SHOW_TITLE((short) 0x1C6),//1A1
    ANGELIC_CHANGE((short) 0x1C7),//1A2
    SHOW_CHAIR((short) 0x1CA),//1A5
    UPDATE_CHAR_LOOK((short) 0x1CB),//1A6
    SHOW_FOREIGN_EFFECT((short) 0x1CC),//1A7
    GIVE_FOREIGN_BUFF((short) 0x1CD),//1A8
    CANCEL_FOREIGN_BUFF((short) 0x1CE),//1A9
    UPDATE_PARTYMEMBER_HP((short) 0x1CF),//1AA
    LOAD_GUILD_NAME((short) 0x1D0),//1AB
    LOAD_GUILD_ICON((short) 0x1D1),//1AC
    LOAD_TEAM((short) 0x1D2),//1AD
    SHOW_HARVEST((short) 0x2BA),//1AE
    PVP_HP((short) 0x1D7),//1B0
    CANCEL_CHAIR((short) 0x1E3),//1BC
    DIRECTION_FACIAL_EXPRESSION((short) 0x1E4),//1BD
    MOVE_SCREEN((short) 0x1E5),//1BE
    SHOW_SPECIAL_EFFECT((short) 0x1E6),//1BF
    CURRENT_MAP_WARP((short) 0x1E7),//1C0
    MESOBAG_SUCCESS((short) 0x1E9),//1C2
    MESOBAG_FAILURE((short) 0x1EA),//1C3
    R_MESOBAG_SUCCESS((short) 0x1EB),//1C4
    R_MESOBAG_FAILURE((short) 0x1EC),//1C5
    MAP_FADE((short) 0x1ED),//1C6
    MAP_FADE_FORCE((short) 0x1EE),//1C7
    UPDATE_QUEST_INFO((short) 0x1EF),//1C8
    HP_DECREASE((short) 0x1F0),//1C9
    PLAYER_HINT((short) 0x1F2),//1CB
    PLAY_EVENT_SOUND((short) 0x1F3),//1CC
    PLAY_MINIGAME_SOUND((short) 0x1F4),//1CD
    MAKER_SKILL((short) 0x1F5),//1CE
    OPEN_UI((short) 0x1F8),//1D1
    OPEN_UI_OPTION((short) 0x1FA),//1D3
    INTRO_LOCK((short) 0x1FB),//1D4
    INTRO_ENABLE_UI((short) 0x1FC),//1D5
    INTRO_DISABLE_UI((short) 0x1FD),//1D6
    SUMMON_HINT((short) 0x1FE),//1D7
    SUMMON_HINT_MSG((short) 0x1FF),//1D8
    ARAN_COMBO((short) 0x200),//1D9
    ARAN_COMBO_RECHARGE((short) 0x201),//1DA
    RANDOM_EMOTION((short) 0x202),//1DB
    RADIO_SCHEDULE((short) 0x203),//1DC
    OPEN_SKILL_GUIDE((short) 0x204),//1DD
    GAME_MSG((short) 0x206),//1DF
    GAME_MESSAGE((short) 0x207),//1E0
    BUFF_ZONE_EFFECT((short) 0x208),//1E2
    GO_CASHSHOP_SN((short) 0x20A),//1E3
    DAMAGE_METER((short) 0x20B),//1E4
    TIME_BOMB_ATTACK((short) 0x20C),//1E5
    FOLLOW_MOVE((short) 0x20D),//1E6
    FOLLOW_MSG((short) 0x20E),//1E7
    AP_SP_EVENT((short) 0x209),//1E9
    QUEST_GUIDE_NPC((short) 0x210),//1EA
    REGISTER_FAMILIAR((short) 0x218),//1F1
    FAMILIAR_MESSAGE((short) 0x219),//1F2
    CREATE_ULTIMATE((short) 0x21A),//1F3
    HARVEST_MESSAGE((short) 0x21C),//1F5
    SHOW_MAP_NAME((short) 0x999),
    OPEN_BAG((short) 0x21D),//18B
    DRAGON_BLINK((short) 0x21E),//18C
    PVP_ICEGAGE((short) 0x21F),//18D
    DIRECTION_INFO((short) 0x220),//18E
    REISSUE_MEDAL((short) 0x221),//18F
    PLAY_MOVIE((short) 0x224),//1FD
    CAKE_VS_PIE((short) 0x225),//1FE
    PHANTOM_CARD((short) 0x226),//1FF
    LUMINOUS_COMBO((short) 0x229),//202
    MOVE_SCREEN_X((short) 0x199),//199
    MOVE_SCREEN_DOWN((short) 0x19A),//19A
    CAKE_PIE_INSTRUMENTS((short) 0x19B),//
    SEALED_BOX((short) 0x212),
    COOLDOWN((short) 0x263),//230
    SPAWN_SUMMON((short) 0x265),//232
    REMOVE_SUMMON((short) 0x266),//233
    MOVE_SUMMON((short) 0x267),//234
    SUMMON_ATTACK((short) 0x268),//235
    PVP_SUMMON((short) 0x269),//236
    SUMMON_SKILL((short) 0x26A),//237
    SUMMON_SKILL_2((short) 0x26C),//239
    SUMMON_DELAY((short) 0x26D),//23A
    DAMAGE_SUMMON((short) 0x26E),//23B
    SPAWN_MONSTER((short) 0x271),//23D
    KILL_MONSTER((short) 0x272),//23E
    SPAWN_MONSTER_CONTROL((short) 0x273),//23F
    MOVE_MONSTER((short) 0x275),//241
    MOVE_MONSTER_RESPONSE((short) 0x276),//242
    APPLY_MONSTER_STATUS((short) 0x278),//244
    CANCEL_MONSTER_STATUS((short) 0x279),//245
    DAMAGE_MONSTER((short) 0x27C),//248
    SKILL_EFFECT_MOB((short) 0x27D),//249
    TELE_MONSTER((short) 0x999), //todo sniff
    MONSTER_SKILL((short) 0x999), //todo sniff
    MONSTER_CRC_CHANGE((short) 0x27F),//24B
    SHOW_MONSTER_HP((short) 0x280),//24C
    SHOW_MAGNET((short) 0x281),//24D
    ITEM_EFFECT_MOB((short) 0x282),//24E
    CATCH_MONSTER((short) 0x283),//24F
    MONSTER_PROPERTIES((short) 0x1B9),
    REMOVE_TALK_MONSTER((short) 0x1BA),
    TALK_MONSTER((short) 0x1BB),
    CYGNUS_ATTACK((short) 0x1BF),
    MONSTER_RESIST((short) 0x1C1),//
    MOB_TO_MOB_DAMAGE((short) 0x1C6),
    AZWAN_MOB_TO_MOB_DAMAGE((short) 0x1C9),
    AZWAN_SPAWN_MONSTER((short) 0x999),//1CA
    AZWAN_KILL_MONSTER((short) 0x999),//1CB
    AZWAN_SPAWN_MONSTER_CONTROL((short) 0x999),//1CC
    SPAWN_NPC((short) 0x29C),//268
    REMOVE_NPC((short) 0x29D),//269
    SPAWN_NPC_REQUEST_CONTROLLER((short) 0x29F),//26B
    NPC_ACTION((short) 0x2A0),//26C
    NPC_TOGGLE_VISIBLE((short) 0x2A1),//26D
    INITIAL_QUIZ((short) 0x2A3),//26F
    NPC_UPDATE_LIMITED_INFO((short) 0x2A4),//270
    NPC_SET_SPECIAL_ACTION((short) 0x2A5),//271
    NPC_SCRIPTABLE((short) 0x2A6),//272
    RED_LEAF_HIGH((short) 0x2A7),//273
    SPAWN_HIRED_MERCHANT((short) 0x2AB),//277
    DESTROY_HIRED_MERCHANT((short) 0x2AC),//278
    UPDATE_HIRED_MERCHANT((short) 0x2AD),//279
    DROP_ITEM_FROM_MAPOBJECT((short) 0x2AE),//27A
    REMOVE_ITEM_FROM_MAP((short) 0x2B0),//27C
    SPAWN_KITE_ERROR((short) 0x2B1),//27D
    SPAWN_KITE((short) 0x2B2),//27E
    DESTROY_KITE((short) 0x2B3),//27F
    SPAWN_MIST((short) 0x2B4),//280
    REMOVE_MIST((short) 0x2B5),//281
    SPAWN_DOOR((short) 0x2B6),//282
    REMOVE_DOOR((short) 0x2B7),//283
    MECH_DOOR_SPAWN((short) 0x2B8),//284
    MECH_DOOR_REMOVE((short) 0x2B9),//285
    REACTOR_HIT((short) 0x2BA),//286
    REACTOR_MOVE((short) 0x2BB),//287
    REACTOR_SPAWN((short) 0x2BC),////288
    REACTOR_DESTROY((short) 0x2BE),//28A
    SPAWN_EXTRACTOR((short) 0x2BF),//28B
    REMOVE_EXTRACTOR((short) 0x2C0),//28C
    ROLL_SNOWBALL((short) 0x2C1),//28D
    HIT_SNOWBALL((short) 0x2C2),//28E
    SNOWBALL_MESSAGE((short) 0x2C3),//28F
    LEFT_KNOCK_BACK((short) 0x2C4),//290
    HIT_COCONUT((short) 0x2C5),//291
    COCONUT_SCORE((short) 0x2C6),//292
    MOVE_HEALER((short) 0x2C7),//293
    PULLEY_STATE((short) 0x2C8),//294
    MONSTER_CARNIVAL_START((short) 0x2C9),//295
    MONSTER_CARNIVAL_OBTAINED_CP((short) 0x2CA),//296
    MONSTER_CARNIVAL_STATS((short) 0x2CB),////297
    MONSTER_CARNIVAL_SUMMON((short) 0x2CD),//299
    MONSTER_CARNIVAL_MESSAGE((short) 0x2CE),//29A
    MONSTER_CARNIVAL_DIED((short) 0x2CF),//29B
    MONSTER_CARNIVAL_LEAVE((short) 0x2D0),//29C
    MONSTER_CARNIVAL_RESULT((short) 0x2D1),//29D
    MONSTER_CARNIVAL_RANKING((short) 0x2D2),//29E
    ARIANT_SCORE_UPDATE((short) 0x300),
    SHEEP_RANCH_INFO((short) 0x301),
    SHEEP_RANCH_CLOTHES((short) 0x999),//0x302
    WITCH_TOWER((short) 0x999),//0x303
    EXPEDITION_CHALLENGE((short) 0x999),//0x304
    ZAKUM_SHRINE((short) 0x305),
    CHAOS_ZAKUM_SHRINE((short) 0x306),
    PVP_TYPE((short) 0x307),
    PVP_TRANSFORM((short) 0x308),
    PVP_DETAILS((short) 0x309),
    PVP_ENABLED((short) 0x30A),
    PVP_SCORE((short) 0x30B),
    PVP_RESULT((short) 0x30C),
    PVP_TEAM((short) 0x30D),
    PVP_SCOREBOARD((short) 0x30E),
    PVP_POINTS((short) 0x310),
    PVP_KILLED((short) 0x311),
    PVP_MODE((short) 0x312),
    PVP_ICEKNIGHT((short) 0x313),//
    HORNTAIL_SHRINE((short) 0x2E1),
    CAPTURE_FLAGS((short) 0x2E2),
    CAPTURE_POSITION((short) 0x2E3),
    CAPTURE_RESET((short) 0x2E4),
    PINK_ZAKUM_SHRINE((short) 0x2E5),
    NPC_TALK((short) 0x337),//0x2E6
    OPEN_NPC_SHOP((short) 0x338),//2E7
    CONFIRM_SHOP_TRANSACTION((short) 0x339),//2E8
    OPEN_STORAGE((short) 0x344),//2F1
    MERCH_ITEM_MSG((short) 0x345),//2F2
    MERCH_ITEM_STORE((short) 0x346),//2F3
    RPS_GAME((short) 0x347),//2F4
    MESSENGER((short) 0x348),////2F5
    PLAYER_INTERACTION((short) 0x349),//2F6
    VICIOUS_HAMMER((short) 0x2F4),
    LOGOUT_GIFT((short) 0x2FB),
    TOURNAMENT((short) 0x236),
    TOURNAMENT_MATCH_TABLE((short) 0x237),
    TOURNAMENT_SET_PRIZE((short) 0x238),
    TOURNAMENT_UEW((short) 0x239),
    TOURNAMENT_CHARACTERS((short) 0x23A),
    WEDDING_PROGRESS((short) 0x236),
    WEDDING_CEREMONY_END((short) 0x237),
    PACKAGE_OPERATION((short) 0x353),//v143
    CS_CHARGE_CASH((short) 0x2CA),
    CS_EXP_PURCHASE((short) 0x23B),
    GIFT_RESULT((short) 0x23C),
    CHANGE_NAME_CHECK((short) 0x23D),
    CHANGE_NAME_RESPONSE((short) 0x23E),
    CS_UPDATE((short) 0x355),//302
    CS_OPERATION((short) 0x356),//303
    CS_MESO_UPDATE((short) 0x306),
    //0x314 int itemid int sn
    CASH_SHOP((short) 0x36C),//316
    CASH_SHOP_UPDATE((short) 0x36D),//317
    GACHAPON_STAMPS((short) 0x253),
    FREE_CASH_ITEM((short) 0x254),
    CS_SURPRISE((short) 0x255),
    XMAS_SURPRISE((short) 0x256),
    ONE_A_DAY((short) 0x258),
    NX_SPEND_GIFT((short) 0x25A),
    KEYMAP((short) 0x376),//320
    PET_AUTO_HP((short) 0x377),//321
    PET_AUTO_MP((short) 0x378),//322
    PET_AUTO_CURE((short) 0x379),//323
    START_TV((short) 0x324),
    REMOVE_TV((short) 0x325),
    ENABLE_TV((short) 0x326),
    GM_ERROR((short) 0x26D),
    ALIEN_SOCKET_CREATOR((short) 0x341),
    GOLDEN_HAMMER((short) 0x279),
    BATTLE_RECORD_DAMAGE_INFO((short) 0x27A),
    CALCULATE_REQUEST_RESULT((short) 0x27B),
    BOOSTER_PACK((short) 0x999),
    BOOSTER_FAMILIAR((short) 0x999),
    BLOCK_PORTAL((short) 0x999),
    NPC_CONFIRM((short) 0x999),
    RSA_KEY((short) 0x999),
    LOGIN_AUTH((short) 0x999),
    PET_FLAG_CHANGE((short) 0x999),
    BUFF_BAR((short) 0x999),
    GAME_POLL_REPLY((short) 0x999),
    GAME_POLL_QUESTION((short) 0x999),
    ENGLISH_QUIZ((short) 0x999),
    FISHING_BOARD_UPDATE((short) 0x999),
    BOAT_EFFECT((short) 0x999),
    FISHING_CAUGHT((short) 0x999),
    SIDEKICK_OPERATION((short) 0x999),
    FARM_PACKET1((short) 0x35C),
    FARM_ITEM_PURCHASED((short) 0x35D),
    FARM_ITEM_GAIN((short) 0x358),
    HARVEST_WARU((short) 0x35A),
    FARM_MONSTER_GAIN((short) 0x35B),
    FARM_INFO((short) 0x368),
    FARM_MONSTER_INFO((short) 0x369),
    FARM_QUEST_DATA((short) 0x36A),
    FARM_QUEST_INFO((short) 0x36B),
    FARM_MESSAGE((short) 0x999),//36C
    UPDATE_MONSTER((short) 0x36D),
    AESTHETIC_POINT((short) 0x36E),
    UPDATE_WARU((short) 0x36F),
    FARM_EXP((short) 0x374),
    FARM_PACKET4((short) 0x375),
    QUEST_ALERT((short) 0x377),
    FARM_PACKET8((short) 0x378),
    FARM_FRIENDS_BUDDY_REQUEST((short) 0x37B),
    FARM_FRIENDS((short) 0x37C),
    FARM_USER_INFO((short) 0x388),
    FARM_AVATAR((short) 0x38A),
    FRIEND_INFO((short) 0x38D),
    FARM_RANKING((short) 0x38F), //+69
    SPAWN_FARM_MONSTER1((short) 0x393),
    SPAWN_FARM_MONSTER2((short) 0x394),
    RENAME_MONSTER((short) 0x395),
    STRENGTHEN_UI((short) 0x402),//39D
    //Unplaced:
    MAPLE_POINT((short) 0xED),//E6
    DEATH_COUNT((short) 0x206),

    REDIRECTOR_COMMAND((short) 0x1337), 
    
    SHOW_DAMAGE_SKIN((short) 0xDA);//:v

    private short code = -2;

    @Override
    public void setValue(short code) {
        this.code = code;
    }

    @Override
    public short getValue() {
        return getValue(true);
    }

    public short getValue(boolean show) {
        if (show && ServerConfig.logPackets && !isSpamHeader(this)) {
            String tab = "";
            for (int i = 4; i > Integer.valueOf(this.name().length() / 8); i--) {
                tab += "\t";
            }
            System.out.println("[Send]\t" + this.name() + tab + "|\t" + this.code + "\t|\t" + HexTool.getOpcodeToString(this.code)/* + "\r\nCaller: " + Thread.currentThread().getStackTrace()[2] */);
            FileoutputUtil.log("PacketLog.txt", "\r\n\r\n[Send]\t" + this.name() + tab + "|\t" + this.code + "\t|\t" + HexTool.getOpcodeToString(this.code) + "\r\n\r\n");
        }
        return code;
    }

    private SendPacketOpcode(short code) {
        this.code = code;
    }

    public String getType(short code) {
        String type = null;
        if (code >= 0 && code < 0xE || code >= 0x17 && code < 0x21) {
            type = "CLogin";
        } else if (code >= 0xE && code < 0x17) {
            type = "LoginSecure";
        } else if (code >= 0x21 && code < 0xCB) {
            type = "CWvsContext";
        } else if (code >= 0xD2) {
            type = "CField";
        }
        return type;
    }

    public static String getOpcodeName(int value) {
        for (SendPacketOpcode opcode : SendPacketOpcode.values()) {
            if (opcode.getValue(false) == value) {
                return opcode.name();
            }
        }
        return "UNKNOWN";
    }

    public boolean isSpamHeader(SendPacketOpcode opcode) {
        switch (opcode) {
            case AUTH_RESPONSE:
            case SERVERLIST:
            case UPDATE_STATS:
            case MOVE_PLAYER:
            case SPAWN_NPC:
            case SPAWN_NPC_REQUEST_CONTROLLER:
            case REMOVE_NPC:
            case MOVE_MONSTER:
            case MOVE_MONSTER_RESPONSE:
            case SPAWN_MONSTER:
            case SPAWN_MONSTER_CONTROL:
            case HAKU_MOVE:
            /*case MOVE_SUMMON:
             case MOVE_FAMILIAR:
            
             case ANDROID_MOVE:
             case INVENTORY_OPERATION:*/
            case MOVE_PET:
            case SHOW_SPECIAL_EFFECT:
            case DROP_ITEM_FROM_MAPOBJECT:
            case REMOVE_ITEM_FROM_MAP:
            //case UPDATE_PARTYMEMBER_HP:
            case DAMAGE_PLAYER:
            case SHOW_MONSTER_HP:
            case CLOSE_RANGE_ATTACK:
            case RANGED_ATTACK:
            //case ARAN_COMBO:
            case REMOVE_BG_LAYER:
            case SPECIAL_STAT:
            case TOP_MSG:
            case NPC_ACTION:
//            case ANGELIC_CHANGE:
            case UPDATE_CHAR_LOOK:
            case KILL_MONSTER:
                return true;
        }
        return false;
    }
}
