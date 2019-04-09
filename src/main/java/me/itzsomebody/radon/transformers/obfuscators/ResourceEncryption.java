/*
 * Radon - An open-source Java obfuscator
 * Copyright (C) 2019 ItzSomebody
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package me.itzsomebody.radon.transformers.obfuscators;

import java.util.LinkedHashMap;
import java.util.Map;
import me.itzsomebody.radon.config.ConfigurationSetting;
import me.itzsomebody.radon.exceptions.InvalidConfigurationValueException;
import me.itzsomebody.radon.exclusions.ExclusionType;
import me.itzsomebody.radon.transformers.Transformer;

/**
 * Encrypts bundled resources to prevent viewing / modification of the data.
 *
 * @author ItzSomebody
 */
public class ResourceEncryption extends Transformer {
    @Override
    public void transform() {
        // TODO
    }

    @Override
    public ExclusionType getExclusionType() {
        return ExclusionType.RESOURCE_ENCRYPTION;
    }

    @Override
    public String getName() {
        return "Resource encryption";
    }

    @Override
    public Object getConfiguration() {
        return new LinkedHashMap<>(); // TODO
    }

    @Override
    public void setConfiguration(Map<String, Object> config) {
        // TODO
    }

    @Override
    public void verifyConfiguration(Map<String, Object> config) {
        throw new InvalidConfigurationValueException(ConfigurationSetting.RESOURCE_ENCRYPTION + " expects a boolean");
    }
}
