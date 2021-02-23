/*
 * Bevragen Ingeschreven Personen RvIG
 *
 * API voor het bevragen van ingeschreven personen uit de basisregistratie personen (BRP), inclusief de registratie niet-ingezeten (RNI). Met deze API kun je personen zoeken en actuele gegevens over personen, kinderen, partners en ouders raadplegen.  Gegevens die er niet zijn of niet actueel zijn krijg je niet terug. Heeft een persoon bijvoorbeeld geen geldige nationaliteit, en alleen een beëindigd partnerschap, dan krijg je geen gegevens over nationaliteit en partner.  Zie de [Functionele documentatie](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/tree/v1.2.0/features) voor nadere toelichting.  De API zal door RvIG worden aangeboden. Daarin wordt een aantal afgeleide gegevens niet opgenomen. Daarom bevat deze specificatie minder gegevens dan de specificatie op [BRP-bevragen](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/blob/master/specificatie/genereervariant/openapi.yaml). 
 *
 * The version of the OpenAPI document: 1.2.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Geeft aan welke gegevens over het voltrekken van het huwelijk of aangaan van het partnerschap in onderzoek zijn. Zie de functionele specificaties. Zie de [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/blob/v1.1.0/features/in_onderzoek.feature) 
    /// </summary>
    [DataContract(Name = "AangaanHuwelijkPartnerschapInOnderzoek")]
    public partial class AangaanHuwelijkPartnerschapInOnderzoek : IEquatable<AangaanHuwelijkPartnerschapInOnderzoek>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AangaanHuwelijkPartnerschapInOnderzoek" /> class.
        /// </summary>
        /// <param name="datum">datum.</param>
        /// <param name="land">land.</param>
        /// <param name="plaats">plaats.</param>
        /// <param name="datumIngangOnderzoek">datumIngangOnderzoek.</param>
        public AangaanHuwelijkPartnerschapInOnderzoek(bool datum = default(bool), bool land = default(bool), bool plaats = default(bool), DatumOnvolledig datumIngangOnderzoek = default(DatumOnvolledig))
        {
            this.Datum = datum;
            this.Land = land;
            this.Plaats = plaats;
            this.DatumIngangOnderzoek = datumIngangOnderzoek;
        }

        /// <summary>
        /// Gets or Sets Datum
        /// </summary>
        [DataMember(Name = "datum", EmitDefaultValue = false)]
        public bool Datum { get; set; }

        /// <summary>
        /// Gets or Sets Land
        /// </summary>
        [DataMember(Name = "land", EmitDefaultValue = false)]
        public bool Land { get; set; }

        /// <summary>
        /// Gets or Sets Plaats
        /// </summary>
        [DataMember(Name = "plaats", EmitDefaultValue = false)]
        public bool Plaats { get; set; }

        /// <summary>
        /// Gets or Sets DatumIngangOnderzoek
        /// </summary>
        [DataMember(Name = "datumIngangOnderzoek", EmitDefaultValue = false)]
        public DatumOnvolledig DatumIngangOnderzoek { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AangaanHuwelijkPartnerschapInOnderzoek {\n");
            sb.Append("  Datum: ").Append(Datum).Append("\n");
            sb.Append("  Land: ").Append(Land).Append("\n");
            sb.Append("  Plaats: ").Append(Plaats).Append("\n");
            sb.Append("  DatumIngangOnderzoek: ").Append(DatumIngangOnderzoek).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as AangaanHuwelijkPartnerschapInOnderzoek);
        }

        /// <summary>
        /// Returns true if AangaanHuwelijkPartnerschapInOnderzoek instances are equal
        /// </summary>
        /// <param name="input">Instance of AangaanHuwelijkPartnerschapInOnderzoek to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AangaanHuwelijkPartnerschapInOnderzoek input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Datum == input.Datum ||
                    this.Datum.Equals(input.Datum)
                ) && 
                (
                    this.Land == input.Land ||
                    this.Land.Equals(input.Land)
                ) && 
                (
                    this.Plaats == input.Plaats ||
                    this.Plaats.Equals(input.Plaats)
                ) && 
                (
                    this.DatumIngangOnderzoek == input.DatumIngangOnderzoek ||
                    (this.DatumIngangOnderzoek != null &&
                    this.DatumIngangOnderzoek.Equals(input.DatumIngangOnderzoek))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                hashCode = hashCode * 59 + this.Datum.GetHashCode();
                hashCode = hashCode * 59 + this.Land.GetHashCode();
                hashCode = hashCode * 59 + this.Plaats.GetHashCode();
                if (this.DatumIngangOnderzoek != null)
                    hashCode = hashCode * 59 + this.DatumIngangOnderzoek.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}