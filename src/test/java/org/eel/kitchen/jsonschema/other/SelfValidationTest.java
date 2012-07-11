/*
 * Copyright (c) 2012, Francis Galiegue <fgaliegue@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Lesser GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Lesser GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.eel.kitchen.jsonschema.other;

public final class SelfValidationTest
{
//    private JsonNode draftv3;
//    private JsonNode googleAPI;
//    private JsonValidator validator;
//
//    @BeforeClass
//    public void setUp()
//        throws IOException
//    {
//        draftv3 = JsonLoader.fromResource("/schema-draftv3.json");
//        googleAPI = JsonLoader.fromResource("/other/google-json-api.json");
//        validator = AbstractJsonValidator.fromNode(draftv3);
//    }
//
//    @Test
//    public void testSchemaValidatesItself()
//    {
//        final ValidationContext context = new ValidationContext();
//
//        validator.validate(context, draftv3);
//
//        assertTrue(context.isSuccess());
//    }
//
//    @Test
//    public void testGoogleSchemas()
//    {
//        final Map<String, JsonNode> schemas
//            = CollectionUtils.toMap(googleAPI.get("schemas").fields());
//
//        ValidationContext context;
//        String name;
//        JsonNode node;
//
//        for (final Map.Entry<String, JsonNode> entry: schemas.entrySet()) {
//            name = entry.getKey();
//            node = entry.getValue();
//            context = new ValidationContext();
//            validator.validate(context, node);
//            assertTrue(context.isSuccess(), name);
//        }
//    }
}
