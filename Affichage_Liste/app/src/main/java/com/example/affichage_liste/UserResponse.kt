package com.example.affichage_liste

class UserResponse {
    var status = 0
    var total_cases = 0
    var active_cases = 0
    var deaths = 0
    var recovered = 0
    var critical = 0
    var tested = 0
    var death_ratio = 0f
    var recovery_ratio = 0f
    var regions: String? = null
    var name: String? = null
    var generated_on = 0
    var iso3166a2: String? = null
    var iso3166a3: String? = null
    override fun toString(): String {
        return "UserResponse{" +
                "status=" + status +
                ", total_cases=" + total_cases +
                ", active_cases=" + active_cases +
                ", deaths=" + deaths +
                ", recovered=" + recovered +
                ", critical=" + critical +
                ", tested=" + tested +
                ", death_ratio=" + death_ratio +
                ", recovery_ratio=" + recovery_ratio +
                ", regions='" + regions + '\'' +
                ", name='" + name + '\'' +
                ", generated_on=" + generated_on +
                ", iso3166a2='" + iso3166a2 + '\'' +
                ", iso3166a3='" + iso3166a3 + '\'' +
                '}'
    }
}