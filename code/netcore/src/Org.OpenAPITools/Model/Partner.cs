/* 
 * Bevragen Ingeschreven Personen
 *
 * API voor het bevragen van ingeschreven personen uit de basisregistratie personen (BRP), inclusief de registratie niet-ingezeten (RNI). Met deze API kun je personen zoeken en actuele gegevens over personen, kinderen, partners en ouders raadplegen.  Gegevens die er niet zijn of niet actueel zijn krijg je niet terug. Heeft een persoon bijvoorbeeld geen geldige nationaliteit, en alleen een beëindigd partnerschap, dan krijg je geen gegevens over nationaliteit en partner.  Zie de [Functionele documentatie](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/tree/v1.0.0/features) voor nadere toelichting. 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Gegevens over een gesloten huwelijk/geregistreerd partnerschap van de persoon. 
    /// </summary>
    [DataContract]
    public partial class Partner :  IEquatable<Partner>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Partner" /> class.
        /// </summary>
        /// <param name="burgerservicenummer">burgerservicenummer.</param>
        /// <param name="geslachtsaanduiding">geslachtsaanduiding.</param>
        /// <param name="soortVerbintenis">soortVerbintenis.</param>
        /// <param name="naam">naam.</param>
        /// <param name="geboorte">geboorte.</param>
        /// <param name="inOnderzoek">inOnderzoek.</param>
        /// <param name="aangaanHuwelijkPartnerschap">aangaanHuwelijkPartnerschap.</param>
        /// <param name="geheimhoudingPersoonsgegevens">Gegevens mogen niet worden verstrekt aan derden/ maatschappelijke instellingen. .</param>
        public Partner(string burgerservicenummer = default(string), GeslachtEnum geslachtsaanduiding = default(GeslachtEnum), SoortVerbintenisEnum soortVerbintenis = default(SoortVerbintenisEnum), Naam naam = default(Naam), Geboorte geboorte = default(Geboorte), PartnerInOnderzoek inOnderzoek = default(PartnerInOnderzoek), AangaanHuwelijkPartnerschap aangaanHuwelijkPartnerschap = default(AangaanHuwelijkPartnerschap), bool geheimhoudingPersoonsgegevens = default(bool))
        {
            this.Burgerservicenummer = burgerservicenummer;
            this.Geslachtsaanduiding = geslachtsaanduiding;
            this.SoortVerbintenis = soortVerbintenis;
            this.Naam = naam;
            this.Geboorte = geboorte;
            this.InOnderzoek = inOnderzoek;
            this.AangaanHuwelijkPartnerschap = aangaanHuwelijkPartnerschap;
            this.GeheimhoudingPersoonsgegevens = geheimhoudingPersoonsgegevens;
        }
        
        /// <summary>
        /// Gets or Sets Burgerservicenummer
        /// </summary>
        [DataMember(Name="burgerservicenummer", EmitDefaultValue=false)]
        public string Burgerservicenummer { get; set; }

        /// <summary>
        /// Gets or Sets Geslachtsaanduiding
        /// </summary>
        [DataMember(Name="geslachtsaanduiding", EmitDefaultValue=false)]
        public GeslachtEnum Geslachtsaanduiding { get; set; }

        /// <summary>
        /// Gets or Sets SoortVerbintenis
        /// </summary>
        [DataMember(Name="soortVerbintenis", EmitDefaultValue=false)]
        public SoortVerbintenisEnum SoortVerbintenis { get; set; }

        /// <summary>
        /// Gets or Sets Naam
        /// </summary>
        [DataMember(Name="naam", EmitDefaultValue=false)]
        public Naam Naam { get; set; }

        /// <summary>
        /// Gets or Sets Geboorte
        /// </summary>
        [DataMember(Name="geboorte", EmitDefaultValue=false)]
        public Geboorte Geboorte { get; set; }

        /// <summary>
        /// Gets or Sets InOnderzoek
        /// </summary>
        [DataMember(Name="inOnderzoek", EmitDefaultValue=false)]
        public PartnerInOnderzoek InOnderzoek { get; set; }

        /// <summary>
        /// Gets or Sets AangaanHuwelijkPartnerschap
        /// </summary>
        [DataMember(Name="aangaanHuwelijkPartnerschap", EmitDefaultValue=false)]
        public AangaanHuwelijkPartnerschap AangaanHuwelijkPartnerschap { get; set; }

        /// <summary>
        /// Gegevens mogen niet worden verstrekt aan derden/ maatschappelijke instellingen. 
        /// </summary>
        /// <value>Gegevens mogen niet worden verstrekt aan derden/ maatschappelijke instellingen. </value>
        [DataMember(Name="geheimhoudingPersoonsgegevens", EmitDefaultValue=false)]
        public bool GeheimhoudingPersoonsgegevens { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Partner {\n");
            sb.Append("  Burgerservicenummer: ").Append(Burgerservicenummer).Append("\n");
            sb.Append("  Geslachtsaanduiding: ").Append(Geslachtsaanduiding).Append("\n");
            sb.Append("  SoortVerbintenis: ").Append(SoortVerbintenis).Append("\n");
            sb.Append("  Naam: ").Append(Naam).Append("\n");
            sb.Append("  Geboorte: ").Append(Geboorte).Append("\n");
            sb.Append("  InOnderzoek: ").Append(InOnderzoek).Append("\n");
            sb.Append("  AangaanHuwelijkPartnerschap: ").Append(AangaanHuwelijkPartnerschap).Append("\n");
            sb.Append("  GeheimhoudingPersoonsgegevens: ").Append(GeheimhoudingPersoonsgegevens).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as Partner);
        }

        /// <summary>
        /// Returns true if Partner instances are equal
        /// </summary>
        /// <param name="input">Instance of Partner to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Partner input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Burgerservicenummer == input.Burgerservicenummer ||
                    (this.Burgerservicenummer != null &&
                    this.Burgerservicenummer.Equals(input.Burgerservicenummer))
                ) && 
                (
                    this.Geslachtsaanduiding == input.Geslachtsaanduiding ||
                    (this.Geslachtsaanduiding != null &&
                    this.Geslachtsaanduiding.Equals(input.Geslachtsaanduiding))
                ) && 
                (
                    this.SoortVerbintenis == input.SoortVerbintenis ||
                    (this.SoortVerbintenis != null &&
                    this.SoortVerbintenis.Equals(input.SoortVerbintenis))
                ) && 
                (
                    this.Naam == input.Naam ||
                    (this.Naam != null &&
                    this.Naam.Equals(input.Naam))
                ) && 
                (
                    this.Geboorte == input.Geboorte ||
                    (this.Geboorte != null &&
                    this.Geboorte.Equals(input.Geboorte))
                ) && 
                (
                    this.InOnderzoek == input.InOnderzoek ||
                    (this.InOnderzoek != null &&
                    this.InOnderzoek.Equals(input.InOnderzoek))
                ) && 
                (
                    this.AangaanHuwelijkPartnerschap == input.AangaanHuwelijkPartnerschap ||
                    (this.AangaanHuwelijkPartnerschap != null &&
                    this.AangaanHuwelijkPartnerschap.Equals(input.AangaanHuwelijkPartnerschap))
                ) && 
                (
                    this.GeheimhoudingPersoonsgegevens == input.GeheimhoudingPersoonsgegevens ||
                    this.GeheimhoudingPersoonsgegevens.Equals(input.GeheimhoudingPersoonsgegevens)
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
                if (this.Burgerservicenummer != null)
                    hashCode = hashCode * 59 + this.Burgerservicenummer.GetHashCode();
                if (this.Geslachtsaanduiding != null)
                    hashCode = hashCode * 59 + this.Geslachtsaanduiding.GetHashCode();
                if (this.SoortVerbintenis != null)
                    hashCode = hashCode * 59 + this.SoortVerbintenis.GetHashCode();
                if (this.Naam != null)
                    hashCode = hashCode * 59 + this.Naam.GetHashCode();
                if (this.Geboorte != null)
                    hashCode = hashCode * 59 + this.Geboorte.GetHashCode();
                if (this.InOnderzoek != null)
                    hashCode = hashCode * 59 + this.InOnderzoek.GetHashCode();
                if (this.AangaanHuwelijkPartnerschap != null)
                    hashCode = hashCode * 59 + this.AangaanHuwelijkPartnerschap.GetHashCode();
                hashCode = hashCode * 59 + this.GeheimhoudingPersoonsgegevens.GetHashCode();
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
